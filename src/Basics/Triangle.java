package Basics;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int arr[] = new int[total];
        for(int i=0;i<total;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<total;i++){
            if(arr[i]+arr[i+1]>arr[i+2]){
                System.out.println("-1");
            }
            else{
                System.out.println(arr[i]+arr[i+1]+arr[i+2]);
            }
        }
    }
}
