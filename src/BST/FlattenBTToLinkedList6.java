package BST;



// https://www.hackingnote.com/en/interview/problems/flatten-binary-tree-to-linked-list
public class FlattenBTToLinkedList6 {


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        BST bst = new BST();

        bst.preOrderTraversal(root);

        System.out.println("*****************");

        FlattenBTToLinkedList6 flattenBTToLinkedList6 = new FlattenBTToLinkedList6();
        flattenBTToLinkedList6.flatten(root);

        bst.preOrderTraversal(root);
      //  System.out.println();


    }


    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *   public int val;
     *   public TreeNode left, right;
     *   public TreeNode(int val) {
     *     this.val = val;
     *     this.left = this.right = null;
     *   }
     * }
     */
        /**
         * @param root: a TreeNode, the root of the binary tree
         * @return: nothing
         */
        public void flatten(Node root) {
            if (root == null || root.left == null && root.right == null) {
                return;
            }

            if (root.left != null) {
                flatten(root.left);
                Node tmpRight = root.right;
                root.right = root.left;
                root.left = null;
                Node t = root.right;
                while (t.right != null) {
                    t = t.right;
                }
                t.right = tmpRight;
            }
            flatten(root.right);
        }
}
