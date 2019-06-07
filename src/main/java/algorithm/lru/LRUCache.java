package algorithm.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, Node<Integer>> map = new HashMap<>();
    Node<Integer> head = null;
    Node<Integer> tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node<Integer> node = map.get(key);
            deleteNode(node);
            setHead(node);
            return node.data;
        }
        return -1;
    }

    public void set(int key, int value){
        if (map.containsKey(key)){
            Node<Integer> node = map.get(key);
            node.data = value;
            deleteNode(node);
            setHead(node);
        }else {
            Node<Integer> newNode = new Node<>(key, value);
            if(map.size() == capacity){
                map.remove(tail.key);
                deleteNode(tail);
            }

            map.put(key, newNode);
            setHead(newNode);
        }
    }

    private void deleteNode(Node<Integer> node){
        if(node.previous != null){
            node.previous.next = node.next;
        }else{
            head = node.next;
        }

        if(node.next != null){
            node.next.previous = node.previous;
        }else {
            tail = node.previous;
        }
    }

    private void setHead(Node<Integer> node){
        node.next = head;
        node.previous = null;

        if (head != null){
            head.previous = node;
        }
        if (tail == null){
            tail = node;
        }
        head = node;
    }
}
