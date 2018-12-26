package trees;

public class ClosesBSTValue24 {


    public int goal = 0;
    public int min= Integer.MAX_VALUE;


    public void process(TreeNode root, int target){
        if(root.value == target){
            goal = root.value;
            return;
        }

        if(Math.abs(root.value -target) < min){
            goal = root.value;
            min = Math.abs(root.value-target);
        }

        if(target < root.value){
            process(root.left, target);
        }else{
            process(root.right,target);
        }
    }
}
