package Leetcode;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class MissingNumber {
    public static void main(String[] args) throws Exception {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                int t = Integer.parseInt(br.readLine());
//                for (int g = 0; g < t; g++) {
//                    String[] str = (br.readLine()).trim().split(" ");
//                    int arr[] = new int[str.length];
//                    for (int i = 0; i < str.length; i++) {
//                        arr[i] = Integer.parseInt(str[i]);
//                    }
                    int[] arr = 
                    int n = arr.length-1;
                    int sum = n * ((n-1)/2);
                    int actualsum = 0;
                    for(int i=0;i<n;i++){
                        actualsum+=arr[i];
                    }

                    System.out.println(sum-actualsum);
                    System.out.println("~");
                }
            }
        }

