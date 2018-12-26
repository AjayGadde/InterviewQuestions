package trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeAndDeSerialize29 {





    public String serialize(TreeNode node, String str){
        if(node == null){
            str = str+"null,";
        }else{
            str = str+ node.value+",";
            serialize(node.left, str);
            serialize(node.right, str);
        }
        return str;
    }



    public TreeNode deSerialize(List<String> data){
        if(data.get(0).equals("null")){
            data.remove(0);
        }

        TreeNode root = new TreeNode(Integer.valueOf(data.get(0)));
        data.remove(0);
        root.left = deSerialize(data);
        root.right = deSerialize(data);
        return root;
    }


    public TreeNode deSerialize(String data){
        String[] dataArray = data.split(",");
        List<String> data_list = Arrays.asList(dataArray);
        return deSerialize(data_list);
    }



}
