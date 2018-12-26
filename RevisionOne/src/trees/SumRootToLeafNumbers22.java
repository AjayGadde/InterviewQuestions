package trees;

public class SumRootToLeafNumbers22 {


    public int sumNumbers(TreeNode root){
        if(root == null){
            return 0;
        }
        return  dfs(root, 0, 0);
    }


    public int dfs(TreeNode node, int sum, int current){

    if(node == null){
        return sum;
    }


    current = current*10 + node.value;
    if(node.left == null && node.right == null){
        sum = sum + current;
        return sum;
    }

    sum = dfs(node.left,sum, current ) + dfs(node.right, sum, current);

    return sum;
    }
}
