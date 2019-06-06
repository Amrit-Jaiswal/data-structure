package com.example.sorting;

import java.util.stream.IntStream;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {3,2,5,4,7,9,5};
        int[] sort = sort(a);

        IntStream.of(sort)
                .forEach(System.out::println);

    }

    private static int[] sort(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length - i -1; j++){
                int val1 = a[j];
                int val2 = a[j+1];
                if(val1 > val2){
                    a[j] = val2;
                    a[j+1] = val1;
                }
            }
        }
        return a;
    }

  }
