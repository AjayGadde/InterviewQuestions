package Arrays;

public class ContainerWithMostWater45a {

        public int maxAreaBetweenContainers(int[] height){

            int maxArea = 0;
            int i=0;
            int j= height.length-1;
            while(i<j){
                maxArea = Math.max(maxArea, Math.min(height[i], height[j])*(j-i));

                if(height[i]>height[j]){
                    j--;
                }else{
                    i++;
                }
            }

            return maxArea;

        }

}
