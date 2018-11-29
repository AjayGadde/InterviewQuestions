package BST;

public class PathSum7a {

// https://www.programcreek.com/2013/01/leetcode-path-sum/
    public static void main(String[] args) {
        PathSum7a pathSum6a = new PathSum7a();
        // for a binary tree not BST
//        BST bst = new BST();
//        Node root = new Node();
//        root.value = 10;
//        // insertion
//        bst.insert(root, 4);
//        bst.insert(root, 8);
//        bst.insert(root, 11);
//        bst.insert(root, 13);
//        bst.insert(root, 7);
//        bst.insert(root, 2);
//        bst.insert(root, 4);
//        bst.insert(root, 1);
//        System.out.println(pathSum6a.hasPathSum(root,22 ));
    }


    public boolean hasPathSum(Node node, int sum){
        if(node == null){
            return false;
        }
        if(node.value == sum && node.left == null && node.right == null){
            return true;
        }

        return hasPathSum(node.left, sum-node.value) || hasPathSum(node.right, sum-node.value);
    }

}
