package Basics;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Basics.Fibonacci series : ");
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < n; i++){
                if(i==0){
                    System.out.print(i+" ");
                }else if(i==1) {
                    System.out.print(i+" ");
                }else{
                    int temp = prev;
                    prev = curr;
                    curr = temp + prev;
                    System.out.print(curr+" ");
                }
        }
    }
}
