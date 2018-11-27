package Others;

public class LRUCacheNode {
    int key;
    int value;
    LRUCacheNode prev;
    LRUCacheNode next;

    public LRUCacheNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}
