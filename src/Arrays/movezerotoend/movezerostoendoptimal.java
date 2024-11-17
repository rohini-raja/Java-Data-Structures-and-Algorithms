package Arrays.movezerotoend;

public class movezerostoendoptimal {
    public static void main(String[] args) {
        // Optimal approach - single traversal -   TC - O(N), SC - O(1)
        int[] arr = {1,0,5,6,0,0,2,3,0};
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
