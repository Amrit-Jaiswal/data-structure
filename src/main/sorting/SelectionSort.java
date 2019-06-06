package com.example.sorting;

import java.util.stream.IntStream;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {200,100,20,-15,30,5,75};
        int[] sort = sort(a);

        IntStream.of(sort)
                .forEach(System.out::println);
    }

    private static int[] sort(int a[]){
        int len = a.length;
        for(int i=0; i< len; i++){
            int index = i;
            for(int j=i+1; j<len; j++){
                if(a[index] > a[j]){
                    index = j;
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

        }
        return a;
    }
}
