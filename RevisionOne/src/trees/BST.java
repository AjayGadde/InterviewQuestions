package trees;

import heaps.Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BST {


    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            TreeNode current = new TreeNode(value);
            return  current;
        }

        if(value < root.value){
            root.left = insert(root.left, value);

        }else if(value > root.value){
            root.right = insert(root.right, value);
        }else{
            System.out.println("value already exists");
        }

        return root;
    }


    // Breadth first search
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);


        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.println(node.value);

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }

        }
    }



    public void levelOrderTraversal1d(TreeNode node){

        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();


        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
         current.add(node);


        while(!current.isEmpty()){
            TreeNode tempNode = current.remove();
            if(tempNode.left != null){
                next.add(tempNode.left);
            }
            if(tempNode.right != null){
                next.add(tempNode.right);
            }
            tempList.add(tempNode.value);

            if(current.isEmpty()){
                resultList.add(tempList);
                current = next;
                next = new LinkedList<TreeNode>();
                tempList = new ArrayList<Integer>();

            }
        }
    }


    public void verticalOrderTraversal(TreeNode root){


        HashMap<Integer,ArrayList<Integer>> resultMap = new HashMap<Integer, ArrayList<Integer>>();

        LinkedList<TreeNode> nodeList = new LinkedList<TreeNode>();
        LinkedList<Integer> levelList = new LinkedList<Integer>();

        if(root != null) {
            nodeList.add(root);
            levelList.add(0);
        }

        int minLevel = 0;
        int maxLevel = 0;

        while (!nodeList.isEmpty()){
            TreeNode node = nodeList.poll();
            Integer level = levelList.poll();

            if(resultMap.get(level) != null){
                ArrayList temp = resultMap.get(level);
                temp.add(node.value);
                resultMap.put(level, temp);
            }else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(node.value);
                resultMap.put(level, temp);
            }

            minLevel = Math.max(level, minLevel);
            maxLevel = Math.max(level,maxLevel);

            if(node.left != null){
                nodeList.add(node.left);
                levelList.add(level-1);
            }

            if(node.right != null){
                nodeList.add(node.right);
                levelList.add(level +1);
            }
        }


        for(int i = minLevel; i<=maxLevel;i++){
            // print hashmap
         //   System.out.println();
        }

    }


}
