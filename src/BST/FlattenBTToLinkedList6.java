package BST;

public class FlattenBTToLinkedList6 {




    public void flatten(Node node){
        if(node == null || (node.left == null && node.right == null)){
            return;
        }


        if(node.left != null){
            flatten(node.left);
        }
    }
}
