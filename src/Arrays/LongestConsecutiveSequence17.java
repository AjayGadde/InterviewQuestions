package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence17 {


    public static void main(String[] args) {

        LongestConsecutiveSequence17 longestConsecutiveSequence17 = new LongestConsecutiveSequence17();
        int[] arr = new int[]{100,4,200,1,3,2};
        int count = longestConsecutiveSequence17.process(arr);

    }



     public int process(int[] num){
        if(num.length==0){
            return 0;
        }
         Set<Integer> set = new HashSet<Integer>();

        for(int i:num){
            set.add(i);
        }

        int max = 1;

        for(int i: num){

            int l = i-1;
            int r = i+1;
            int count = 1;

            while(set.contains(l)){
                count++;
                set.remove(l);
                l--;
            }

            while(set.contains(r)){
                count++;
                set.remove(r);
                r++;
            }

            max = Math.max(count,max);
        }
        return max;
    }
}
