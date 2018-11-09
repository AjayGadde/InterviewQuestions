package Arrays;

import java.util.Stack;

public class ReversePolishNotation2 {

    public static void main(String[] args) {
        ReversePolishNotation2 obj = new ReversePolishNotation2();
        String[] tokens = new String[]{"2","1","+","3","*"};
        String operators = "+-*/";

        Stack<Integer> stack = new Stack<Integer>();

        for(String token:tokens) {
            if(!operators.contains(token)){
                stack.push(Integer.parseInt(token));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                switch (token){
                    case "+": stack.push(a+b);
                        break;
                    case "-": stack.push(b-a);
                        break;
                    case "*": stack.push(a*b);
                        break;
                    case "/": stack.push(b/a);
                        break;
                }
            }

        }
        System.out.println(stack.pop());
    }
}
