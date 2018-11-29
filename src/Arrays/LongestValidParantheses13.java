package Arrays;


import java.util.Stack;

// https://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
public class LongestValidParantheses13 {

    public static void main(String[] args) {
        LongestValidParantheses13 longestValidParantheses13 = new LongestValidParantheses13();
  //      System.out.println(longestValidParantheses13.findMaxLen(")()())"));
        System.out.println(longestValidParantheses13.findMaxLen("()"));

    }


    public int findMaxLen(String s){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        int result = 0;
        for(int i=0; i<s.length();i++){
          char c = s.charAt(i);
          if(c == '('){
              stack.push(i);
          }else{
              stack.pop();
              if(!stack.isEmpty()){
                  result = Math.max(result, i-stack.peek());

              }else{
                  stack.push(i);
              }
          }
        }
        return result;
    }

}
