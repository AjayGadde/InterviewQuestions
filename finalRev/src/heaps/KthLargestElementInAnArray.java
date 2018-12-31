package heaps;

import java.util.PriorityQueue;


// https://www.techiedelight.com/find-kth-largest-element-array/
public class KthLargestElementInAnArray {




    // uses min heap

    public int kthLargestElement(int[] arr, int k){


        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0; i< k; i++){
            queue.offer(arr[i]);
        }

        for(int i=k; i< arr.length;i++){

            if(arr[i]> queue.peek()){
                queue.poll();
                queue.offer(arr[i]);
            }

        }


        return queue.poll();


    }
}
