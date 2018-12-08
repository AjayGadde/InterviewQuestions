package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLongestConsecutiveSeq4 {


    public static void main(String[] args) {
        LinkedList l = new LinkedList();

    }


    int maxlength = 0;


    public int longestConsecutive(Node root){
        if(root == null){
            return 0;
        }
        longestConsecutiveHelper(root, 1, root.value+1);
        return  maxlength;
    }



    private void longestConsecutiveHelper(Node root, int length, int target){
        if(root == null){
            return;
        }

        if(root.value == target){
            length = length +1;
        }else{
            length = 1;
        }
        maxlength = Math.max(length,maxlength);
        longestConsecutiveHelper(root.left, length, root.value + 1);
        longestConsecutiveHelper(root.right, length, root.value +1);


    }
}
