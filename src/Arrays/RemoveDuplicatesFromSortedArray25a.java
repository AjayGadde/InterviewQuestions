package Arrays;

public class RemoveDuplicatesFromSortedArray25a {

        public int removeDuplicates(int[] nums){

            int i=0;
            int j=1;

            while(j < nums.length){

                if(nums[i] == nums[j]){
                    j++;
                }else{
                    i++;
                    nums[i] = nums[j];
                    j++;
                }


            }
return i+1;
        }

}