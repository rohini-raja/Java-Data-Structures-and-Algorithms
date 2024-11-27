package BinarySearch;

import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
        // Test input
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;

        // Call the function and print the output
        int[] result = searchRange(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]= FirstndLast(nums,target,true);
        if(ans[0]!=-1){
            ans[1] = FirstndLast(nums,target,false);
        }
        return ans;
    }
    static int FirstndLast(int[] nums, int target, boolean booleanfindfirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end  = mid-1;
            } else if(target > nums[mid]){
                start = mid+1;
            } else {
                ans = mid;
                if(booleanfindfirst){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
