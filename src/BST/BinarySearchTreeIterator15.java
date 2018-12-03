package BST;

import java.util.Stack;

// not working
// https://www.programcreek.com/2014/04/leetcode-binary-search-tree-iterator-java/
public class BinarySearchTreeIterator15 {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = new Node(8);
        bst.insert(root, 3);
        bst.insert(root,1);
        bst.insert(root,6);
        bst.insert(root,4);
        bst.insert(root,7);
        bst.insert(root,10);
        bst.insert(root,14);
        bst.insert(root,13);

      bst.inOrderTraversal(root);

        BinarySearchTreeIterator15 binarySearchTreeIterator15 = new BinarySearchTreeIterator15(root);
//        System.out.println(binarySearchTreeIterator15.next());
//        System.out.println(binarySearchTreeIterator15.next());
//        System.out.println(binarySearchTreeIterator15.next());
    }



    Stack<Node> stack;


    public BinarySearchTreeIterator15(Node root){
        stack = new Stack<Node>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }



    public boolean hasNext(){
        return !stack.isEmpty();
    }


    public int next(){
        Node node = stack.pop();
        int result = node.value;
        while(node.right != null){
            stack.push(node);
            node = node.left;
        }
        return  result;
    }
}
