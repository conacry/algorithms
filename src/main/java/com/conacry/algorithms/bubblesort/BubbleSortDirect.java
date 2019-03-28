package com.conacry.algorithms.bubblesort;

import com.conacry.algorithms.Sorter;

public class BubbleSortDirect implements Sorter {


    public void sort(long[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    long temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }  
    }
}