package BST;


// https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
public class SymmetricTree14 {

    public static void main(String[] args) {
        SymmetricTree14 symmetricTree14 = new SymmetricTree14();
    //    symmetricTree14.process(root, root);
    }



    public boolean process(Node n1, Node n2){
        if(n1 == null && n2 == null){
            return true;
        }

        if(n1 != null && n2!= null && n1.value == n2.value) {
            return (process(n1.left,n2.right) && process(n1.right, n2.left));

        }
        return false;
    }
}
