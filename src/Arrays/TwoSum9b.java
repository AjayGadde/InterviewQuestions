package Arrays;

import java.util.Arrays;

public class TwoSum9b {


    // array is sorted
    public static void main(String[] args) {
        TwoSum9b twoSum9b = new TwoSum9b();
        int[] numbers = {1,3,5,7, 13};
        System.out.println(Arrays.toString(twoSum9b.process(numbers, 12)));
    }


    public int[] process(int[] numbers , int target){
        if(numbers == null || numbers.length ==0){
            return null;
        }
        int i =0;
        int j = numbers.length -1 ;
        while(i < j){
            int x = numbers[i] + numbers[j];
            if(x < target){
                i++;
            }else if(x > target){
                j--;
            }else{
                return new int[]{i,j};
            }
        }
        return null;
    }
}
