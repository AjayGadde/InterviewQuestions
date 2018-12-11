package Arrays;


// Very important to handle both constant time and space (search for it during revision)
public class MinStack33 {

    public Elem top;

    public void push(int x) {
        if (top == null) {
            top = new Elem(x, x);
        } else {
            Elem elem = new Elem(x, Math.min(x, top.min));
            elem.next = top;
            top = elem;
        }
    }

    public int pop(){
        if(top == null){
            return -1;
        }
        int res = top.value;
        top = top.next;
        return res;
    }


    public int getMin(){
        if(top == null){
            return -1;
        }
        return top.min;
    }



}
