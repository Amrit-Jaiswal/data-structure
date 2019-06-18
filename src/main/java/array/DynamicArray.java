package array;

public class DynamicArray<T> {
    private int len = 0;
    private int capacity = 10;
    T[] array;

    DynamicArray(){
        array = (T[])new Object[capacity];
    }

    DynamicArray(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("Illegal capacity "+ capacity);
        }
        this.capacity = capacity;
        array = (T[])new Object[capacity];
    }

    public int size(){
        return len;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        if(index > len){
            throw new ArrayIndexOutOfBoundsException("Index is not present "+index);
        }
        T data = array[index];
        return data;
    }

    public void add(int index, T ele){
        if(index >= capacity){
            createNewArray();
            add(index, ele);
        }
        array[index] = ele;
    }

    public void add(T ele){
        if(len >= capacity){
            createNewArray();
        }
        array[len++] = ele;
    }

    public boolean remove(Object obj){
        T ele = (T)obj;
        boolean found = false;
        for(int i=0; i<size(); i++){
            if(array[i] == ele){
                found = true;
                for(int j=i; j<size()-1; j++){
                    array[j] = array[j+1];
                }
                len--;
                break;
            }
        }

        return found;
    }

    private void createNewArray() {
        int newCapacity = (array.length * 3)/2 + 1;
        T[] newArray = (T[])new Object[newCapacity];
        for(int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
