package trees;

import java.util.Stack;

public class KthSmallestElement {



    public int kthSmallest(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(root != null){
            stack.push(root);
            root = root.left;
        }

        int count = 0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            count++;

            if(count == k ){
                return node.value;
            }

            TreeNode right = node.right;
            while(right != null){
                stack.push(right);
                right= right.left;
            }

        }
return -1;

    }
}
