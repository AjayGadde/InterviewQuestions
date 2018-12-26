package trees;

public class LCAOfBST17 {




    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){

        int rootValue = root.value;
        int pValue = p.value;
        int qValue = q.value;


        if((rootValue < pValue) && (rootValue < qValue)){
            return LCA(root.right,p,q);
        }else if(rootValue > pValue && rootValue > qValue){
            return LCA(root.left,p,q);
        }else {
            return root;
        }
    }
}
