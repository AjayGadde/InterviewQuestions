package BST;

public class SortedArrayToBST9 {


    public static void main(String[] args) {

    }


    public Node process(int[] num, int start, int end){

        if(start > end){
            return null;
        }

        int mid = (start+end)/2;

        Node node = new Node(num[mid]);

        node.left = process(num, start, mid-1);
        node.right = process(num,mid+1, end);
        return node;

    }
}
