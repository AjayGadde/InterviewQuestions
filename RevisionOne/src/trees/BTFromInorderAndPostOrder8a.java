package trees;

public class BTFromInorderAndPostOrder8a {





    int[] inorder = new int[]{4,2,5,1,6,7,3,8};
    int[] postorder = new int[]{4,5,2,6,7,8,3,1};


    public TreeNode construct(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend){

        if(instart > inend ){
            return null;
        }
        int root = postorder[postorder.length-1];
        TreeNode rootNode = new TreeNode(root);
        int k=0;
        for(int i=0; i< inorder.length; i++)
        {
            if(root == inorder[i]){
                k=i;
                break;
            }
        }

        int numberOfNodes = k-instart;
        rootNode.left = construct(inorder, instart, numberOfNodes-1, postorder,poststart, poststart+numberOfNodes-1);
        rootNode.right = construct(inorder, numberOfNodes+1, inend, postorder, poststart+numberOfNodes, postend);
        return rootNode;










    }







}
