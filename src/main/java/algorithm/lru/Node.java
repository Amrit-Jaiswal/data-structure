package algorithm.lru;

public class Node<T> {
    T data;
    T key;
    Node<T> next;
    Node<T> previous;

    public Node(T key, T data){
        this.key = key;
        this.data = data;
    }
}
