package trees;

public class InOrderSuccessorBST30 {




    public TreeNode process(TreeNode root, TreeNode target){

        TreeNode node = root;
        TreeNode next = null;

        while(node != null && node != target){

            if(target.value < node.value){
                next = node;
                node = node.left;
            }else if(target.value > node.value){
                node = node.right;
            }
        }

        if(node == null){
            return null;
        }

        if(node.right == null){
            return next;
        }


        node = node.right;

        while(node != null){
            node = node.left;
        }

        return node;

    }
}
