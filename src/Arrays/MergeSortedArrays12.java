package Arrays;

public class MergeSortedArrays12 {

    public static void main(String[] args) {
        int[] a = new int[]{1,5,7};
        int[] b = new int[]{2,4,6};
        MergeSortedArrays12 mergeSortedArrays12 = new MergeSortedArrays12();
        mergeSortedArrays12.merge(a, b, a.length, b.length);
    }


    public void merge(int[] a, int[] b, int m, int n){
        while(m > 0 && n > 0){

            if(a[m-1] > b[n-1]){
                a[m+n-1] = a[m-1];
                m--;
            }else{
                a[m+n-1] = b[n-1];
                n--;
            }

            while(n > 0){
                a[m+n-1] = b[n-1];
                n--;

            }
        }
    }
}
