package Basics;

public class Addzerostoend {
    public static void main(String[] args) {
        int arr[] = {0,0,4,0,7};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
