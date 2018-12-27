package Arrays;





// https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/

import java.util.Arrays;

public class SearchForARange47 {


    public static void main(String[] args) {
//        SearchForARange47 searchForARange47 = new SearchForARange47();
//        int[] nums = new int[]{5,7,7,8,8,10};
//    //    int[] ans = searchForARange47.searchRange(nums, 8);
//        System.out.println(Arrays.toString(ans));
    }



    public int first(int[] arr, int first, int last, int target, int n){

        if(last > first ) {
            int mid = first + (last-first)/2;

            if ((mid == 0 || arr[mid-1]< target) && arr[mid] == target) {

                return mid;

            } else if (target > mid){
                return first(arr, mid+1, last, target, n);
            }else{
                return first(arr, first, mid-1, target, n);
            }

        }
        return -1;


    }


    public int last(int[] arr, int first, int last, int target, int n){

        if(last > first ) {
            int mid = first + (last-first)/2;

            if ((mid ==n-1 || arr[mid+1]> target) && arr[mid] == target) {

                return mid;

            } else if (target > mid){
                return first(arr, mid+1, last, target, n);
            }else{
                return first(arr, first, mid-1, target, n);
            }

        }
        return -1;



    }






}
