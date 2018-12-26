package trees;

public class SameTree28 {


    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q== null){
            return true;
        }else if(p == null || q == null){
            return false;
        }

        if(p.value == q.value) {
            return isSameTree(p.left, p.right) && isSameTree(p.right, q.right);
        }else {
            return false;
        }
    }

}
