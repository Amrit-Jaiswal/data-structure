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
        for(int i=1; i<len; i++){
            int temp = a[i];
            for(int j=i; j>0; j--){
                if(a[j-1] > temp){
                    a[j] = a[j-1];
                }else {
                    a[j] = temp;
                    break;
                }
                if(j-1 == 0){
                    a[j-1] = temp;
                    break;
                }
            }

        }

        return a;
    }
}
