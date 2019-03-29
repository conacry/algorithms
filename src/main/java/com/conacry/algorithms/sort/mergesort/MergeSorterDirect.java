package com.conacry.algorithms.sort.mergesort;

import com.conacry.algorithms.sort.Sorter;

public class MergeSorterDirect implements Sorter {

    public void sort(long[] array) {
        mergeSort(array, array.length);
    }

    private void mergeSort(long[] array, int n) {
        if (n < 2) {
            return;
        }
        
        int mid = n / 2;
        long[] leftArray = new long[mid];
        long[] rightArray = new long[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray, mid);
        mergeSort(rightArray, n - mid);

        merge(array, leftArray, rightArray, mid, n - mid);
    }

    private void merge(long[] array, long[] leftArray, long[] rightArray, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < left) {
            array[k++] = leftArray[i++];
        }

        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}