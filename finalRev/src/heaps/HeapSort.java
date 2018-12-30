package heaps;

public class HeapSort {


    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {5,6,4,9}; // some dummy array
        heapSort.buildMaxHeap(arr);  // first build Max or Min heap

        int n = arr.length;
        for(int i=n-1; i >=0; i--){ // swap first and last elements and then apply heapify
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            heapSort.heapify_max(arr, 0, i);
        }
    }

    public void buildMaxHeap(int[] arr){

        int N = arr.length;
        for(int i = N/2-1 ; i>=0; i--){
            heapify_max(arr, i, N);
        }
    }


    public void heapify_max(int[] arr, int i, int N){

        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;

        if(left < N && arr[largest] < arr[left] ){
            largest = left;
        }

        if(right < N && arr[largest] < arr[right]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify_max(arr, largest, N);
        }

    }


}


// Time complexity is O(n * log(n))