package Arrays.movezerotoend;

public class Movezerostoendbruteforce {
    public static void main(String[] args) {
        // Time complexity - O(N)
        // Space complexity - O(N)
        int[] arr = {2,3,0,3,9,0,2};
        // Brute Force
        int[] temp = new int[arr.length]; //create a temporary array and store all the values
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            temp[j++] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=temp[i]; //copy all the elements from the temp array to original array
        }
    }
}
