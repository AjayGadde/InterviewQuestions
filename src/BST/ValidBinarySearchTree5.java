package BST;


// https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
public class ValidBinarySearchTree5 {

    public static void main(String[] args) {
        BST bst = new BST();
        Node root = new Node();
        root.value = 10;
        // insertion
        bst.insert(root, 5);
        bst.insert(root, 7);
        bst.insert(root, 15);
        bst.insert(root, 13);
        ValidBinarySearchTree5 validBinarySearchTree5 = new ValidBinarySearchTree5();
        System.out.println(validBinarySearchTree5.isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

    boolean isBSTUtil(Node node, int min, int max){
        if(node == null){
            return true;
        }
        if(node.value < min || node.value > max){
            return false;
        }
        return (isBSTUtil(node.left, min, node.value-1) &&
                isBSTUtil(node.right, node.value+1, max));
    }
}
