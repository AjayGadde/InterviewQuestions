package trees;

import java.util.*;

public class BinaryTreeRightSideView16 {


    public List<Integer> rightSideView(TreeNode root) {

        Map<Integer, Integer> rightMostValueAtDepth = new HashMap<Integer, Integer>();
        int max_depth = -1;

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();

        nodeStack.push(root);
        depthStack.push(0);

        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if(node != null){
                max_depth = Math.max(max_depth,depth);

                if(!rightMostValueAtDepth.containsKey(depth)){
                    rightMostValueAtDepth.put(depth,node.value);
                }
                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth+1);
                depthStack.push(depth+1);
            }
        }


        List<Integer> rightView = new ArrayList<Integer>();
        for(int depth=0; depth <= max_depth; depth++){
            rightView.add(rightMostValueAtDepth.get(depth));
        }
        return rightView;
    }



}
