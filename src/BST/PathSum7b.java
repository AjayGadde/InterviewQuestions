package BST;


import java.util.ArrayList;
import java.util.List;

// https://www.programcreek.com/2014/05/leetcode-path-sum-ii-java/
public class PathSum7b {

    public static void main(String[] args) {


        Node node7 = new Node(7);
        Node node2 = new Node(2);
        Node node5 = new Node(5);
        Node node1 = new Node(1);
        Node node13 = new Node(13);

        Node node11 = new Node(11,node7, node2);
        Node nodeSecond4 = new Node(4, node5,node1);

        Node node4 = new Node(4, node11, null);
        Node node8 = new Node(8, node13,nodeSecond4);

        Node root = new Node(5, node4, node8);

        PathSum7b pathSum7b = new PathSum7b();
        System.out.println(pathSum7b.process(root, 22).toString());






    }


    public List<ArrayList<Integer>> process(Node node, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (node == null) {
            return result;
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(node.value);
        dfs(node, sum-node.value,result,l);
        return result;
    }


    public void dfs(Node t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> l){
        if(t.left == null && t.right == null && sum ==0){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(l);
            result.add(temp);
        }

        if(t.left != null){
            l.add(t.left.value);
            dfs(t.left, sum-t.left.value, result, l);
            l.remove(l.size()-1);
        }

        if(t.right != null) {
            l.add(t.right.value);
            dfs(t.right, sum - t.right.value, result, l);
            l.remove(l.size() - 1);
        }
    }

}
