package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public static void main(String[] args) {

        BST obj = new BST();
        Node root = new Node();
        root.value = 10;
        // insertion
        obj.insert(root, 5);
        obj.insert(root,7);
        obj.insert(root, 15);
        obj.insert(root,13);

        //Deletion


        // Traversals
        obj.preOrderTraversal(root);
        System.out.println("-----");
        obj.inOrderTraversal(root);
        System.out.println("-----");
        obj.postOrderTraversal(root);
        System.out.println("-----");
        obj.levelOrderTraversal(root);
    }



    // Breadth First Search
    public void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        ((LinkedList<Node>) queue).add(root);

        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.value);

            if(node.left!= null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

    }



    // insert an element into BST
    public Node insert(Node node, int value){
            if(node == null){
                Node current = new Node();
                current.value = value;
                return current;
            }

            if(value < node.value){
                node.left = insert(node.left, value);
            }else if(value > node.value){
                node.right = insert(node.right, value);
            }else{
                System.out.println("value already exists");
            }
            return  node;
    }


    public void preOrderTraversal(Node node){
        if(node != null) {
            System.out.println(node.value);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal(Node node){
        if(node != null) {
            preOrderTraversal(node.left);
            System.out.println(node.value);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node){
        if(node != null) {
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
            System.out.println(node.value);
        }
    }
}
