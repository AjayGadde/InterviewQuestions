package BST;


// https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
public class MinDepthBinaryTree11 {

    public static void main(String[] args) {

    }



    public int process(Node node){

        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return 1;
        }

        if(node.left == null){
            return process(node.right)+1;
        }

        if(node.right == null){
            return  process(node.left)+1;
        }

        return Math.min(process(node.left), process(node.right))+1;

    }
}

