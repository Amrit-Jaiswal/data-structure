package sorting;

import java.util.stream.IntStream;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {200,100,20,15,30,5,75};
        int[] sort = sort(a);

        IntStream.of(sort)
                .forEach(System.out::println);
    }

    private static int[] sort(int a[]){
        int len = a.length;
        int j,key;
        for(int i=1; i<len; i++){
            j=i;
            key = a[i];
            while (j > 0){
                if(a[j-1] > key){
                    a[j] = a[j-1];
                    a[j-1] = key;
                }
                j--;
            }
        }

        return a;
    }
}
