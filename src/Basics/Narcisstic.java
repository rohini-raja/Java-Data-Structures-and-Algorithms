package Basics;

import java.util.Scanner;

public class Narcisstic {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int total = scanner.nextInt();
        for(int i=0;i<total;i++) {
            int val = scanner.nextInt();
            int preval = val;
            int output = 0;
            double power = 0;
            while (val > 0) {
                int lastdig = val % 10;
                val = val / 10;
                power = Math.pow(lastdig, countval(preval));
                output += power;
            }
            if (preval == output) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static int countval(int value) {
        int count = 0;
        while(value>0){
            value = value/10;
            count++;
        }
        return count;
    }
}
