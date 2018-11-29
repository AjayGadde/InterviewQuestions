package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses13 {

    public static void main(String[] args) {
        ValidParentheses13 validParentheses13 = new ValidParentheses13();
    }


    public boolean process(String s) {
        Map<Character, Character> paraMap = new HashMap<Character, Character>();
        paraMap.put('{', '}');
        paraMap.put('[', ']');
        paraMap.put('(', ')');

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            if (paraMap.containsKey(curr)) {
                stack.push(curr);
            } else if (paraMap.containsValue(curr)) {
                if (!stack.isEmpty() && paraMap.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }


        }
        return stack.empty();
    }
}