package tries;

public class TrieNode{
    public boolean isleaf;
    public TrieNode[] children;
    public TrieNode(){
        children = new TrieNode[26];
    }

    public boolean containsKey(char ch){
        return children[ch-'a'] != null;
    }

    public TrieNode get(char ch){
        return children[ch-'a'];
    }

    public void put(char ch, TrieNode node){
        children[ch-'a'] = node;
    }

}
