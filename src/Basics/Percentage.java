package Basics;

import java.util.*;
import java.lang.*;
public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of subjects
        int n = scanner.nextInt();

        // Initialize total marks obtained
        int totalMarksObtained = 0;
        int maxMarksPerSubject = 80;

        // Read marks for each subject and sum them up
        for (int i = 0; i < n; i++) {
            int marks = scanner.nextInt();
            totalMarksObtained += marks;
        }

        // Calculate total possible marks
        int totalPossibleMarks = n * maxMarksPerSubject;

        // Calculate the percentage
        double percentage = ((double) totalMarksObtained / totalPossibleMarks) * 100;

        // Print result formatted to 2 decimal places with a percent symbol
        System.out.printf("%.2f%%\n", percentage);
    }
}
