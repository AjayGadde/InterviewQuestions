package Arrays;

import java.util.HashMap;

public class ContainsDuplicate24b {


    public boolean process(int[] nums, int k){

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(j-i <=k){
                    return true;
                }
            }
            map.put(nums[i],i);

        }

        return false;
    }

}
