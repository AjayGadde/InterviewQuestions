package BST;



// https://www.geeksforgeeks.org/fix-two-swapped-nodes-of-bst/
public class RecoverBST27 {

Node first,middle, last, prev;

    public static void main (String[] args)
    {
        /*   6
            / \
           10  2
          / \ / \
         1  3 7 12

        10 and 2 are swapped
        */

        Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);

        System.out.println("Inorder Traversal"+
                " of the original tree");
        RecoverBST27 tree = new RecoverBST27();
        tree.printInorder(root);

        tree.correctBST(root);

        System.out.println("\nInorder Traversal"+
                " of the fixed tree");
        tree.printInorder(root);
    }

    /* A utility function to print
     Inoder traversal */
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(" " + node.value);
        printInorder(node.right);
    }


    public void correctBST(Node root){
// Initialize pointers needed
        // for correctBSTUtil()
        first = middle = last = prev = null;

        // Set the poiters to find out
        // two nodes
        correctBSTUtil( root );

        // Fix (or correct) the tree
        if( first != null && last != null )
        {
            int temp = first.value;
            first.value = last.value;
            last.value = temp;
        }
        // Adjacent nodes swapped
        else if( first != null && middle !=
                null )
        {
            int temp = first.value;
            first.value = middle.value;
            middle.value = temp;
        }

        // else nodes have not been swapped,
        // passed tree is really BST.


    }



    void correctBSTUtil(Node root){
        if( root != null )
        {
            // Recur for the left subtree
            correctBSTUtil( root.left);

            // If this node is smaller than
            // the previous node, it's
            // violating the BST rule.
            if (prev != null && root.value <
                    prev.value)
            {
                // If this is first violation,
                // mark these two nodes as
                // 'first' and 'middle'
                if (first == null)
                {
                    first = prev;
                    middle = root;
                }

                // If this is second violation,
                // mark this node as last
                else
                    last = root;
            }

            // Mark this node as previous
            prev = root;

            // Recur for the right subtree
            correctBSTUtil( root.right);
        }

    }
}
