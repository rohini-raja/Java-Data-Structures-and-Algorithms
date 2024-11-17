package Arrays.movezerotoend;

public class movezerostoendbetter {
    public static void main(String[] args) {
        // Better Approach - TC - O(N), SC - O(1)
        int [] arr = {1,0,4,0,0,7,0,3};
        int n =  arr.length;
        // without temp array, shift the non zero numbers
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
