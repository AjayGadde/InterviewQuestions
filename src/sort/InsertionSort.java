package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.process(new int[]{10,34,5,19});
    }

    public void process(int[] input){

        for(int i = 1; i< input.length; i++){
            for(int j = i; j>0; j--){
                if(input[j] < input[j-1]){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
