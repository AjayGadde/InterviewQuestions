package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.process(new int[]{10, 34,2,1});
    }

    public void process(int[] input){
        for(int i=0; i< input.length-1; i++){
            int min = i;
            for(int j = i+1; j< input.length; j++){
                if(input[j]< input[min]){
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        System.out.println(Arrays.toString(input));
    }
}
