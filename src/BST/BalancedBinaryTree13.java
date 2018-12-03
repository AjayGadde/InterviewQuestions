package BST;


// https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
public class BalancedBinaryTree13 {

public boolean isBalanced(Node node){

    if(node == null){
        return false;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    if((Math.abs(lh-rh)<=1) && isBalanced(node.left)&& isBalanced(node.right)){
        return true;
    }

    return false;

}





public int height(Node node){
    if (node == null){
        return 0;
    }
    return 1+ Math.max(height(node.left), height(node.right));
}

}