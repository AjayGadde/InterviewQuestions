package LinkedList;

import java.util.Stack;

public class ImplementQueueUsingStacks15b {



    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();



    public void enqueue(int a){

        stack2.push(a);

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

    }





}
