package array;

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray();

        System.out.println("Size of Array " +dynamicArray.size());

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);

        System.out.println("Element in Arrays");
        for(int i=0; i<dynamicArray.size(); i++){
            System.out.print (dynamicArray.get(i) + " ");
        }

        boolean remove = dynamicArray.remove(new Integer(10));
        if(remove){
            System.out.println("\nAfter removal of element in Arrays");
            for(int i=0; i<dynamicArray.size(); i++){
                System.out.print (dynamicArray.get(i) + " ");
            }
        }else {
            System.out.println("\nElement not present");
        }
    }
}
