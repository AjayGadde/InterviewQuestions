package arrays;

public class TrappingRainWater45b {

    public static void main(String[] args) {
        TrappingRainWater45b trappingRainWater45b = new TrappingRainWater45b();
        System.out.println(trappingRainWater45b.process(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));


    }


    public int process(int[] arr){

        if(arr.length<=2){
            return 0;
        }
        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        l[0] = arr[0];

        int i = 1;
        while(i < arr.length){
            l[i] = Math.max(arr[i], l[i-1]);
            i++;
        }

        r[arr.length-1] = arr[arr.length-1];
        int j = arr.length-2;
        while(j >=0){
            r[j] = Math.max(arr[j], r[j+1]);
            j--;
        }

        int count=0;
        for(int k=0; k< arr.length-1; k++){
            count = count+ (Math.min(l[k],r[k])- arr[k]);

        }
        return count;

    }

}
