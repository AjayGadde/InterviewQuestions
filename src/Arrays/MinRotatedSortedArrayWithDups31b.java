package Arrays;

public class MinRotatedSortedArrayWithDups31b {




    public int findMin(int[] nums){
        int i=0;
        int j= nums.length-1;

        while(i<=j){

            while(nums[i] == nums[j] && i==j){
                i++;
            }

            int m = (i+j)/2;

            if(nums[m]> nums[i]){
                i = m+1;
            }else{
                j=m;
            }


        }
        return -1;


    }


}
