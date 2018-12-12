package Arrays;

public class RemoveElement25c {



    public int process(int[] nums, int element){

        int i =0 ;
        int j= 0;

        while(j< nums.length){
            if(nums[j] != element ){
                nums[i]= nums[j];
                i++;
            }
            j++;

        }
        return i;


    }


}
