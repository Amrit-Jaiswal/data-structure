package stack;

public class StackUsingLinkedList {
    private Node top;
    private int size;
    private int count = 0;

    public StackUsingLinkedList(int size) {
        this.size = size;
    }

    private <T> void push(T data){
        if(isStackFull()){
            System.out.println("Stack is full");
        }else{
            Node newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
            count++;
            System.out.println("Data pushed into stack : "+data);
        }

    }

    private <T> T pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty");
        }else {
            Object data = top.data;
            top = top.next;
            System.out.println("Poped element is : "+data);
            count--;
            return (T) data;
        }

        return null;
    }

    private boolean isStackEmpty(){
        return top == null;
    }

    private boolean isStackFull(){
        return count == size;
    }



    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList(3);
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.push("A");
        stackUsingLinkedList.push("B");
        stackUsingLinkedList.push("C");
        stackUsingLinkedList.push("D");
        stackUsingLinkedList.push("E");
        stackUsingLinkedList.pop();
        stackUsingLinkedList.pop();
    }
}
