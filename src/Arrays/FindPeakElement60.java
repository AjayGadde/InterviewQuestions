package Arrays;


// refer geeksforgeeks for explanation
// if an element is greater than neighbours, it is called peak element

//    https://leetcode.com/problems/find-peak-element/solution/



public class FindPeakElement60 {


        public int findPeakElement(int[] nums) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (nums[mid] > nums[mid + 1])
                    r = mid;
                else
                    l = mid + 1;
            }
            return l;
        }


}
