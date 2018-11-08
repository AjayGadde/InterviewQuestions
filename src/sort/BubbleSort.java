package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] x = new int[]{4,3,1,2,5};
        System.out.println("input array:" + Arrays.toString(x) );

        for(int i=0; i < x.length-1; i++){
            for(int j=i+1;j<= x.length-i-1; j++){
                if(x[i] > x[j]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        System.out.println("output array:" + Arrays.toString(x));
    }
}
