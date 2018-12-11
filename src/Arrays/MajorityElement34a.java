package Arrays;

public class MajorityElement34a {


    public int getMajorityElement(int[] nums){
        int count = 0;
        int result = 0;

        for(int i=0; i< nums.length; i++){
            if(count == 0){
                result = nums[i];
                count++;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return result;
    }

}
