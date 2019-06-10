package stack;

public class StackUsingArray {
    private int[] arr;
    private int size;
    private int top = -1;

    StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
    }

    private void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            arr[++top] = data;
            System.out.println("data push into stack is: "+data);
        }
    }

    private int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            int data = arr[top];
            top--;
            System.out.println("Element poped from stack is :"+data);
            return data;
        }

        return -1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == size-1;
    }


    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(3);
        stackUsingArray.pop();
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.push(4);
        stackUsingArray.push(5);
        stackUsingArray.pop();
        stackUsingArray.pop();
    }


}
