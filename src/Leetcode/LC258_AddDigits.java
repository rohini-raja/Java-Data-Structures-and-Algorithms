package Leetcode;

import java.util.Scanner;

public class LC258_AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addDigits(n));
    }
        public static int addDigits(int num) {
            if(num<10){
                return num;
            } //if the num is less than 10, go ahead and return the number
            int sum = 0;
            while(num>0){
                sum+=num%10;
                num = num/10;
            }
            return addDigits(sum);
        }
    }
