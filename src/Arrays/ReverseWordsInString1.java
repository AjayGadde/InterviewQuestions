package Arrays;

import java.util.Arrays;

public class ReverseWordsInString1 {


    public static void main(String[] args) {
        ReverseWordsInString1 obj = new ReverseWordsInString1();
        String s = "the sky is blue";
        char[] input = s.toCharArray();
        System.out.println(Arrays.toString(input));
        int j= 0;
        for(int i = 0; i< input.length; i++){
            if(input[i] == ' '){
                obj.reverse(input, j, i-1);
                j = i+1;
            }
        }
        obj.reverse(input, j, input.length-1);
        obj.reverse(input, 0, input.length-1);
    }

    public void reverse(char[] input, int start , int end){
        while(start < end){
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(input));
    }


}
