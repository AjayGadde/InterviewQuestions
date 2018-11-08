package Arrays;

import java.util.Arrays;

public class RotateArrayToRight1 {


    public static void main(String[] args) {
        RotateArrayToRight1 obj = new RotateArrayToRight1();
        int[] input = new int[]{1,2,3,4,5,6,7};
        int k=6; // number of positions to rotate to the right
        obj.reverse(input, 0, input.length-1);
        obj.reverse(input, 0, k-1);
        obj.reverse(input,k,input.length-1);

    }

    public void reverse(int[] input, int start, int end){
            while(start < end){
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            }
        System.out.println(Arrays.toString(input));

    }

}
