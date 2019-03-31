package com.conacry.algorithms.sort.insertionsort;

import com.conacry.algorithms.sort.Sorter;

public class InsertionSorterReverse implements Sorter {

    @Override
    public void sort(long[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            long temp = array[i];
            int j = i;

            while (j > 0 && array[j - 1] <= temp) {
                array[j] = array[j - 1];
                j--; 
            }

            array[j] = temp;
        }
    }
}