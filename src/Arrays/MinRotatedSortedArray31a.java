package Arrays;

public class MinRotatedSortedArray31a {



// recursion using BST
    public int process(int[] num, int start, int end){

        if(start == end){
            return num[start];
        }

        if((end-start) == 1){
            return Math.min(num[start],num[end]);
        }


        int middle = start+ (end-start)/2;

        if(num[start] < num[end]){
            return num[start];
        }else if(num[middle] > num[start]){
            return process(num, middle, end);
        }else{
            return  process(num, start, middle);
        }




    }


}
