package trees;

public class LCABT18 {





    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){


        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right,p,q);

        if(left != null && right != null){
            return root;
        }

        return (left != null)? left:right;

    }
}
