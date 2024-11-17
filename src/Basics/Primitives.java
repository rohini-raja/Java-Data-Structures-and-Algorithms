package Basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a string: ");
        String string = scanner.next();
        System.out.print(string);
    }
}
