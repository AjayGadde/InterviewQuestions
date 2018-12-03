package BST;

public class MaxDepthBinaryTree26 {


    public static void main(String[] args) {

    }


    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int bigger = Math.max(leftDepth, rightDepth);

        return bigger;



    }

}
