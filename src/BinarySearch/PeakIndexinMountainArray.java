package BinarySearch;

public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        // Test cases
        int[] mountainArray1 = {0, 2, 4, 3, 1};
       // int[] mountainArray2 = {1, 3, 5, 4, 2};
        //int[] mountainArray3 = {0, 1, 0};

        // Create an instance of the class
        PeakIndexinMountainArray solution = new PeakIndexinMountainArray();

        // Call the method and print results
        System.out.println("Peak index in mountainArray1: " + solution.peakIndexInMountainArray(mountainArray1));
      //  System.out.println("Peak index in mountainArray2: " + solution.peakIndexInMountainArray(mountainArray2));
      //  System.out.println("Peak index in mountainArray3: " + solution.peakIndexInMountainArray(mountainArray3));

    }
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}