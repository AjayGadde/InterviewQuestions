package BST;

import java.util.Stack;

// https://www.programcreek.com/2014/07/leetcode-kth-smallest-element-in-a-bst-java/
public class KthSmallestElement3 {

    public static void main(String[] args) {
        KthSmallestElement3 kthSmallestElement3 = new KthSmallestElement3();
        BST bst = new BST();
        Node root = new Node();
        root.value = 10;
        // insertion
        bst.insert(root, 5);
        bst.insert(root, 7);
        bst.insert(root, 15);
        bst.insert(root, 13);
        int ans = kthSmallestElement3.process(root,2);

        System.out.println(ans);
    }


    public int process(Node root, int k){
        Stack<Node> stack = new Stack<Node>();
        Node p = root;
        while(p != null){
            stack.push(p);
            p=p.left;
        }

        int i=0;
        while(!stack.isEmpty()){
            Node t = stack.pop();
            i++;
            if(i == k){
                return t.value;
            }

            Node r = t.right;
            while(r != null){
                stack.push(r);
                r= r.left;
            }
        }
        return -1;
    }
}
