package Arrays;

public class MissingNumber57a {



    public int process(int[] nums){

        int sum=0;
        for(int i=0; i< nums.length; i++){
            sum = sum+ nums[i];
        }

        int n = nums.length;
        return (n *(n+1)/2)-sum;
    }


}
