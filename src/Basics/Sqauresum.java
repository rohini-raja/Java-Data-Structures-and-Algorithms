package Basics;

import java.util.Scanner;

public class Sqauresum {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int total = scanner.nextInt();
        for(int i=0;i<total;i++){
            int val = scanner.nextInt();
            int output = 0;
            int sum = 0;
            while(val>0){
                int lastdig = val %10;
                val = val/10;
                double power = Math.pow(lastdig,2);
                output+=power;
            }
            System.out.println(output);
        }
    }
}
