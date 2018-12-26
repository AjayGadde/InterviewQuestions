package BST;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/solution/
public class SerializeAndDeserializeBinaryTree {


    // Serialization
    public class Codec {
        public String rserialize(Node root, String str) {
            // Recursive serialization.
            if (root == null) {
                str += "null,";
            } else {
                str += str.valueOf(root.value) + ",";
                str = rserialize(root.left, str);
                str = rserialize(root.right, str);
            }
            return str;
        }

        // Encodes a tree to a single string.
        public String serialize(Node root) {
            return rserialize(root, "");
        }
    };






    public class dCodec {
        public Node rdeserialize(List<String> l) {
            // Recursive deserialization.
            if (l.get(0).equals("null")) {
                l.remove(0);
                return null;
            }

            Node root = new Node(Integer.valueOf(l.get(0)));
            l.remove(0);
            root.left = rdeserialize(l);
            root.right = rdeserialize(l);

            return root;
        }

        // Decodes your encoded data to tree.
        public Node deserialize(String data) {
            String[] data_array = data.split(",");
            List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
            return rdeserialize(data_list);
        }
    };
}
