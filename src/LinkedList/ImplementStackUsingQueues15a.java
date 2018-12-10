package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues15a {




    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();


    public void push(int a){
            q2.offer(a);
            while(!q1.isEmpty()){
                q2.offer(q1.peek());
                q1.remove();
            }

            Queue temp = q2;
            q2= q1;
            q1 = temp;
    }


    public int pop(){
        return q1.remove();
    }

}
