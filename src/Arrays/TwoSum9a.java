package Arrays;

import java.util.HashMap;



// Array is not sorted
// https://medium.com/@jhng2525/leetcode-two-sum-problem-solution-java-7ccb7a01fb3a
public class TwoSum9a {


    public static void main(String[] args) {
        TwoSum9a twoSum9a = new TwoSum9a();
    }


    public int[] process(int[] num, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0; i< num.length; i++){
            int complement = target - num[i];

            if(hashMap.containsKey(complement)){
               return new int[]{i, hashMap.get(complement)};
            }
            hashMap.put(num[i],i);
            }

        return null;
    }
}
