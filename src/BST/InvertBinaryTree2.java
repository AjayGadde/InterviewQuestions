package BST;

public class InvertBinaryTree2 {

// https://leetcode.com/articles/invert-binary-tree/
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = new Node();
        root.value = 10;
        // insertion
        bst.insert(root, 5);
        bst.insert(root, 7);
        bst.insert(root, 15);
        bst.insert(root, 13);
        bst.preOrderTraversal(root);

        InvertBinaryTree2 invertBinaryTree = new InvertBinaryTree2();
        invertBinaryTree.invertRecursive(root);
        System.out.println("*********");
        bst.preOrderTraversal(root);
    }


    public Node invertRecursive(Node node){
        if(node== null){
            return node;
        }
        Node left = invertRecursive(node.left);
        Node right = invertRecursive(node.right);
        node.right = left;
        node.left = right;
        return node;
    }


    // write iterative approach during revision
    public void invertIterative(Node node){


    }
}
