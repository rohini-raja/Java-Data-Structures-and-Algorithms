public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length-1;
        int start = 0;
        int end = n;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
