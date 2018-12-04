package BST;

public class SameBinaryTree28 {


    public static void main(String[] args) {
        SameBinaryTree28 sameBinaryTree28 = new SameBinaryTree28();
    }


    public boolean process(Node node1, Node node2){

        if(node1 == null && node2==null){
            return  true;
        }else if(node1 == null || node2 == null){
            return false;
        }

        if(node1.value == node2.value){
            return process(node1.left,node2.left) && process(node1.right, node2.right);

        }else{
            return false;
        }
    }
}
