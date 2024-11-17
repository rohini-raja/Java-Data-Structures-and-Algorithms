package Basics;

import java.util.*;
import java.lang.*;

public class AdjacentZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < total; i++) {
            String val = sc.nextLine();
            if(val.contains("00")){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
