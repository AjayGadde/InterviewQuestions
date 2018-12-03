package BST;



//http://javabypatel.blogspot.com/2016/05/construct-binary-tree-from-inorder-and-post-order-traversals.html
public class BTFromInOrderAndPostOrder {

    public static void main(String[] args) {

        BTFromInOrderAndPostOrder btFromInOrderAndPostOrder = new BTFromInOrderAndPostOrder();
        int[] inorder = new int[]{4,2,5,1,6,7,3,8};
        int[] postorder = new int[]{4,5,2,6,7,8,3,1};
        int inStart = 0;
        int inEnd = inorder.length-1;
        int postStart = 0;
        int postEnd = postorder.length-1;
        btFromInOrderAndPostOrder.buildTree(inorder,inStart,inEnd,postorder,postStart,postEnd);



    }


    public Node buildTree(int[] inorder, int instart, int inEnd, int[] postOrder, int postStart, int postEnd){

        if(instart > inEnd ){
            return null;
        }

        int rootValue = postOrder[postEnd];
        Node root = new Node(rootValue);

        int k = 0;
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==rootValue){
                k = i;
                break;
            }
        }

        int numberOfNodes = k-instart;
        root.left = buildTree(inorder,instart,k-1, postOrder,postStart, postStart+ numberOfNodes-1);
        root.right = buildTree(inorder, k+1, inEnd, postOrder, postStart+numberOfNodes, postEnd);
        return root;

    }
}
