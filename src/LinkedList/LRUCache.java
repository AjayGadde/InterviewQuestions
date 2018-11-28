package LinkedList;

import java.util.HashMap;


// https://www.programcreek.com/2013/03/leetcode-lru-cache-java/
public class LRUCache {

    public int capacity;
    public LRUCacheNode endNode;
    public LRUCacheNode headNode;
    HashMap<Integer, LRUCacheNode> map = new HashMap<Integer, LRUCacheNode>();

    public LRUCache(int capacity){
        this.capacity = capacity;
    }


    public void setHeadNode(LRUCacheNode node){
        node.next = headNode;
        node.prev = null;

        if(headNode != null) {
            headNode.prev = node;
        }
        headNode = node;

        if(endNode == null){
            endNode = node;
        }
    }

    // very very important to understand
    public void removeNode(LRUCacheNode node){
        if(node.prev != null){
            node.prev.next = node.next;
        }else{
            headNode = node.next;
        }

        if(node.next != null){
            node.next.prev = node.prev;
        }else{
            endNode = node.prev;
        }
    }


    public void add(int key, int value){
        if(map.containsKey(key)){
            LRUCacheNode node = map.get(key);
            removeNode(node);
            setHeadNode(node);
        }else{
            LRUCacheNode node = new LRUCacheNode(key, value);
            if(map.size() == capacity){
                map.remove(endNode.key);
                removeNode(endNode);
                setHeadNode(node);
            }else{
                setHeadNode(node);
            }
            map.put(key,node);
        }
    }


    public int get(int key){
        if(map.containsKey(key)){
            LRUCacheNode node = map.get(key);
            removeNode(node);
            setHeadNode(node);
            return node.value;
        }
        return -1;
    }
}
