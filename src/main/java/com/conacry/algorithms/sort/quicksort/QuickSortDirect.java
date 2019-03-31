package com.conacry.algorithms.sort.quicksort;

import com.conacry.algorithms.sort.Sorter;

public class QuickSortDirect implements Sorter {

    @Override
    public void sort(long[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(long[] array, int begin, int end) {

        if(begin >= end) {
            return;
        }

        int mid = begin + (end - begin) / 2;
        long pivot = array[mid];
        
        int i = begin;
        int j = end;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (begin < j) {
            quickSort(array, begin, j);
        }

        if(end > i) {
            quickSort(array, i, end);
        }
    }
}