package Arrays;

import java.util.Arrays;

public class HIndex62a {


    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int result = 0;
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            result = Math.max(result, smaller);
        }

        return result;
    }
}
