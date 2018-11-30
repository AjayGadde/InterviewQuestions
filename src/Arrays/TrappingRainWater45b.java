package Arrays;


// https://codepumpkin.com/trapping-rain-water-algorithm-problem/
// https://www.geeksforgeeks.org/trapping-rain-water/
public class TrappingRainWater45b {


    public static void main(String[] args) {
        TrappingRainWater45b trappingRainWater45b = new TrappingRainWater45b();
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int water = trappingRainWater45b.findWater(arr, arr.length);
        System.out.println(water);
    }



    public int findWater(int[] arr, int n){
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;

        left[0] = arr[0];
        for(int i=1; i< n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[n-1] = arr[n-1];
        for (int i= n-2; i>=0; i--){
            right[i] = Math.max(right [i+1],arr[i]);
        }

        for (int i = 0; i < n; i++) {
            water = water + Math.min(left[i], right[i]) - arr[i];
        }
        return water;
    }

}
