package trees;

public class CountCompleteTreeNodes23 {

    public int count(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getLeftHeight(root) +1 ;
        int right = getRightHeight(root) +1 ;

        if(left == right){
            return (2<<(left-1))-1;
        }else{
            return count(root.left)+count(root.right)+1;
        }
    }


    public int getLeftHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int height=0;
        while(node.left != null){
            height++;
            node = node.left;
        }

        return height;
    }

    public int getRightHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int height = 0;

        while(node.right != null){
            height++;
            node = node.right;
        }

        return height;
    }


}
