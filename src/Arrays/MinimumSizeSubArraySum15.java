package Arrays;



/// the solution may not be right. correct it.
// https://www.programcreek.com/2014/05/leetcode-minimum-size-subarray-sum-java/
public class MinimumSizeSubArraySum15 {


    public static void main(String[] args) {
        MinimumSizeSubArraySum15 minimumSizeSubArraySum15 = new MinimumSizeSubArraySum15();


    }
    public int process(int[] nums, int s){
        if(nums[0] == s){
            return 1;
        }
        int l = 0;
        int r = 1;


        int result = Integer.MAX_VALUE;
        int temp = nums[l];

        while( r < nums.length) {
         if (temp + nums[r] < s) {
                temp = temp + nums[r];
                r++;
            } else {
             result = Math.min(temp, r-l);

                if(l == r-1){
                    return 1;
                }
                temp = temp - nums[l];
                l++;
            }
        }

        while(temp >= s ){
            result = Math.min(result, r- l);
            temp = temp - nums[l++];
        }

    return result == Integer.MAX_VALUE ? 0 : result;
    }

}
