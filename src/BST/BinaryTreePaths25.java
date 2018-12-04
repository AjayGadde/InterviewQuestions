package BST;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths25 {


    public List<String> binaryTreePaths(Node root) {

        String sb = "";
        ArrayList<String> result = new ArrayList<String>();

        helper(root, result, sb);

        return result;
    }

    public void helper(Node root, ArrayList<String> result, String s){
        if(root==null){
            return;
        }

        s = s+"->"+root.value;

        if(root.left==null &&root.right==null){
            result.add(s.substring(2));
            return;
        }

        if(root.left!=null){
            helper(root.left, result, s);
        }
        if(root.right!=null){
            helper(root.right, result, s);
        }
    }

}
