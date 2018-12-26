package BST;


// this is wrong. refer revisionone
public class LowestCommonAncestorBST17 {


    public Node process(Node node, Node p, Node q){

        if(node.value > p.value && node.value < q.value){
            return node;
        }else if(node.value> p.value && node.value > q.value){
            return process(node.left, p,q);
        }else if(node.value < p.value && node.value < q.value){
            return  process(node.right, p, q);
        }
        return node;
    }
}
