package Arrays;

public class SearchInsertPosition16 {


    public static void main(String[] args) {

        SearchInsertPosition16 searchInsertPosition16 = new SearchInsertPosition16();
        int[] num = new int[]{1,3,5,7,9,10,12,13};
        int ans = searchInsertPosition16.process(num,11);
        System.out.println(ans);
        }


    public int process(int[] num, int target){


        if(target < num[0]){
            return 0;
        }else if(target > num[num.length-1]){
            return num.length;
        }

        int i=0;
        int j = num.length-1;

        while(i<=j){
            int m = (i+j)/2;

            if(target > num[m]){
                i=m+1;
            }else if(target < num[m]){
                j=m-1;
            }else{
                return m;
            }
        }
        return i;  // why return i not j? take example of [0,1,3] and think about the position of 2
    }
}
