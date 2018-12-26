package BST;

public class InOrderSuccessorInBST30 {


    public static void main(String[] args) {

    }


    public Node process(Node node, Node target){
        Node c = node;
        Node next = null;
        while(c!= null && c.value != target.value){
            if(target.value < c.value){
                next = c;
                c = c.left;
            }else{
                c = c.right;
            }
        }

        if(c == null){
            return null;
        }
        if(c.right == null){
            return next;
        }
        c = c.right;
            while(c.left != null){
                c = c.left;
            }
            return c;
    }
}
