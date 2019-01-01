package tries;

public class Trie {






    public TrieNode root = new TrieNode();


    public void insert(String word){
        TrieNode node = root;
        for(int i=0; i< word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new TrieNode());
            }
            node = node.get(word.charAt(i));
        }
        node.isleaf = true;

    }

    public boolean search(String word){
        TrieNode node = root;
        for(int i=0; i< word.length();i++){
            char ch = word.charAt(i);

            if(!node.containsKey(ch)){
                return false;
            }
            node = node.get(ch);
        }

        if(!node.isleaf){
            return false;
        }

        return true;

    }



}
