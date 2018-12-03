package BST;

public class LowestCommonAncestorBT18 {




    public Node process(Node node, Node n1, Node n2){

        if(node == null){
            return null;
        }

        if(node == n1 || node == n2){
            return node;
        }

        Node leftLca = process(node.left,n1, n2);
        Node rightLca = process(node.right,n1,n2);


        if(leftLca != null && rightLca != null){
            return node;
        }

        return (leftLca != null) ? leftLca:rightLca;
    }
}
