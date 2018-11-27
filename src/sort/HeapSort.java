package sort;


import java.util.Arrays;

//https://www.programiz.com/dsa/heap-sortß
public class HeapSort {

    public static void main(String[] args) {
        int arr[] = {1,12,9,5,6,10};

        HeapSort hs = new HeapSort();
        hs.sort(arr);
    }

    public void sort(int arr[]){
        int n = arr.length;

        //build max heap
        for(int i = n/2-1; i >=0; i--){
            heapify(arr,n ,i);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));

    }

    public void heapify(int arr[], int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i+2;

        if(l < n && arr[l] > arr[largest]){
            largest = l;
        }

        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }

        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
