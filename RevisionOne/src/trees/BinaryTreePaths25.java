package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths25 {


    String sb="";
    ArrayList<String> result = new ArrayList<String>();




    public void process(TreeNode root, ArrayList<String> result, String s){

        s= s+"->";
        if(root.left == null && root.right == null){
            result.add(s.substring(2));
            return;
        }

        if(root.left != null){
            process(root.left, result,s);
        }

        if(root.right != null){

            process(root.right, result, s);
        }

    }


}
