package Arrays;

public class MoveZeroes25d {




    public void MoveZeroes(int[] nums){

        int i = 0;
        int j = 0;

        while(j< nums.length){
            if(nums[j]==0){
                j++;
            }else{
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
