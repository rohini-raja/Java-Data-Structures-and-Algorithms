package Project;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.TrayIcon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Activity Tracker is an application to monitor screen time and provide health reminders.
 * It tracks screen usage and sends periodic notifications to encourage breaks and wellness.
 */
public class ActivityTracker {
    // Configuration constants
    private static final int SCREEN_CHECK_INTERVAL = 5;     // seconds
    private static final int REMINDER_INTERVAL = 3600;      // 1 hour in seconds
    private static final int AWAY_THRESHOLD = 300;          // 5 minutes in seconds
    private static final String REMINDERS_FILE = "reminders.json";

    // Logging
    private static final Logger LOGGER = Logger.getLogger(ActivityTracker.class.getName());

    // Random generator
    private static final Random RANDOM = new Random();

    /**
     * Main application entry point.
     * Provides a menu-driven interface for tracking screen time and managing reminders.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                displayMenu();
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        startScreenTracking();
                        break;
                    case "2":
                        addReminder(scanner);
                        break;
                    case "3":
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    /**
     * Display the main menu options.
     */
    private static void displayMenu() {
        System.out.println("\nScreen Time Tracker and Health Reminder");
        System.out.println("1. Start tracking");
        System.out.println("2. Add new reminder");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1/2/3): ");
    }

    /**
     * Load reminders from a JSON file or return default reminders.
     *
     * @return Map of reminder categories and their associated messages
     */
    private static Map<String, List<String>> loadReminders() {
        try (FileReader reader = new FileReader(REMINDERS_FILE)) {
            JSONObject jsonObject = new JSONObject(new JSONTokener(reader));
            Map<String, List<String>> reminders = new HashMap<>();

            for (String category : jsonObject.keySet()) {
                JSONArray messagesArray = jsonObject.getJSONArray(category);
                List<String> messages = new ArrayList<>();
                for (int i = 0; i < messagesArray.length(); i++) {
                    messages.add(messagesArray.getString(i));
                }
                reminders.put(category, messages);
            }
            return reminders;
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Could not load reminders file. Using defaults.");
            return createDefaultReminders();
        }
    }

    /**
     * Create a map of default health reminders.
     *
     * @return Map of default reminder categories and messages
     */
    private static Map<String, List<String>> createDefaultReminders() {
        Map<String, List<String>> defaultReminders = new HashMap<>();
        defaultReminders.put("Move", List.of(
                "Take a short walk!",
                "Stand up and stretch!",
                "Do some light exercises"
        ));
        defaultReminders.put("Eye Care", List.of(
                "Look away from the screen for 20 seconds",
                "Blink your eyes rapidly",
                "Adjust screen brightness"
        ));
        defaultReminders.put("Hydration", List.of(
                "Drink some water!",
                "Stay hydrated",
                "Take a water break"
        ));
        return defaultReminders;
    }

    /**
     * Save reminders to a JSON file.
     *
     * @param reminders Map of reminder categories and messages
     */
    private static void saveReminders(Map<String, List<String>> reminders) {
        try (FileWriter file = new FileWriter(REMINDERS_FILE)) {
            new JSONObject(reminders).write(file, 2, 0);
            LOGGER.info("Reminders saved successfully");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error saving reminders", e);
        }
    }

    /**
     * Add a new reminder via user input.
     *
     * @param scanner Input scanner for user interactions
     */
    private static void addReminder(Scanner scanner) {
        System.out.print("Enter reminder category: ");
        String category = scanner.nextLine();
        System.out.print("Enter reminder message: ");
        String message = scanner.nextLine();

        Map<String, List<String>> reminders = loadReminders();
        reminders.computeIfAbsent(category, k -> new ArrayList<>()).add(message);
        saveReminders(reminders);

        System.out.println("Reminder added successfully!");
    }

    /**
     * Start tracking screen time and send periodic health reminders.
     */
    private static void startScreenTracking() {
        Map<String, List<String>> reminders = loadReminders();
        int screenOnTime = 0;
        long lastReminderTime = System.currentTimeMillis() / 1000;

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            if (isScreenOn()) {
                screenOnTime += SCREEN_CHECK_INTERVAL;

                if (screenOnTime - lastReminderTime >= REMINDER_INTERVAL) {
                    String category = getRandomKey(reminders);
                    String message = getRandomElement(reminders.get(category));
                    sendNotification("Health Reminder: " + category, message);

                    lastReminderTime = screenOnTime;
                }
            } else {
                if (screenOnTime > 0 && (System.currentTimeMillis() / 1000) - lastReminderTime > AWAY_THRESHOLD) {
                    screenOnTime = 0;
                    lastReminderTime = System.currentTimeMillis() / 1000;
                }
            }
        }, 0, SCREEN_CHECK_INTERVAL, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            scheduler.shutdown();
            LOGGER.info("Screen time tracking stopped");
        }));
    }

    /**
     * Determine if the screen is currently on.
     * Note: This is a platform-specific method that needs to be implemented per OS.
     *
     * @return boolean indicating screen status
     */
    private static boolean isScreenOn() {
        // Platform-specific implementation required
        return true;
    }

    /**
     * Send a desktop notification.
     *
     * @param title Notification title
     * @param message Notification message
     */
    private static void sendNotification(String title, String message) {
        if (!SystemTray.isSupported()) {
            LOGGER.warning("System tray notifications not supported");
            return;
        }

        try {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Health Reminder");

            trayIcon.setImageAutoSize(true);
            trayIcon.displayMessage(title, message, TrayIcon.MessageType.INFO);

            tray.add(trayIcon);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error creating system tray notification", e);
        }
    }

    /**
     * Get a random key from a map.
     *
     * @param map Input map
     * @return Randomly selected key
     */
    private static String getRandomKey(Map<String, List<String>> map) {
        List<String> keys = new ArrayList<>(map.keySet());
        return keys.get(RANDOM.nextInt(keys.size()));
    }

    /**
     * Get a random element from a list.
     *
     * @param list Input list
     * @return Randomly selected element
     */
    private static String getRandomElement(List<String> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }
}