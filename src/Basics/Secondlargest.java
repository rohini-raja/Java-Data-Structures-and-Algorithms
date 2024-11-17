package Basics;

public class Secondlargest {
    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1};
        //find the second largest
        int max = 0;
        int secmax = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=max){
                if(arr[i]>secmax){
                    secmax = arr[i];
                }
            }
        }
        System.out.println(secmax);
    }
}
