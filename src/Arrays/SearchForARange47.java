package Arrays;



// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solution/

import java.util.Arrays;

public class SearchForARange47 {


    public static void main(String[] args) {
        SearchForARange47 searchForARange47 = new SearchForARange47();
        int[] nums = new int[]{5,7,7,8,8,10};
        int[] ans = searchForARange47.searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));
    }



    public int[] searchRange(int[] nums, int target){
        int[] targetRange = {-1,-1};
        int leftIndex = extremeInsertionIndex(nums, target, true);

        if(leftIndex == nums.length || nums[leftIndex] != target){
            return targetRange;
        }

        targetRange[0] = leftIndex;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;
        return targetRange;
    }


    private int extremeInsertionIndex(int[] nums, int target, boolean left){

        int lo = 0;
        int hi = nums.length;

        while(lo < hi){
            int mid = (lo+hi)/2;

            if(nums[mid] > target || (left &&  target == nums[mid])){
                hi = mid;
            }else{
                lo = mid+1;
            }

        }
        return lo;
    }

}
