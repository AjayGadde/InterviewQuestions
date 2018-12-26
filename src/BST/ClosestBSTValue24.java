package BST;


// https://www.programcreek.com/2014/05/leetcode-closest-binary-search-tree-value-java/
public class ClosestBSTValue24 {

    int goal = 0;
    int min = Integer.MAX_VALUE;


    public static void main(String[] args) {
        ClosestBSTValue24 closestBSTValue24 = new ClosestBSTValue24();
        Node root = new Node();
        closestBSTValue24.process(root, 10);
        // goal is the answer
    }

    public void process(Node node, int target){

        if(node == null){
            return;
        }

        // this condition is missing in programcreek
        if(node.value == target){
            return;
        }

        if(Math.abs(node.value-target)< min){
            min = Math.abs(node.value-target);
            goal = node.value;
        }

        if(node.value > target){
            process(node.left, target);
        }else{
            process(node.right,target);
        }


    }
}
