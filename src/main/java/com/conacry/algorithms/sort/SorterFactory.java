package com.conacry.algorithms.sort;

import com.conacry.algorithms.sort.bubblesort.BubbleSorterDirect;
import com.conacry.algorithms.sort.bubblesort.BubbleSorterReverse;
import com.conacry.algorithms.sort.common.Order;
import com.conacry.algorithms.sort.common.SorterType;
import com.conacry.algorithms.sort.insertionsort.InsertionSorterDirect;
import com.conacry.algorithms.sort.insertionsort.InsertionSorterReverse;
import com.conacry.algorithms.sort.mergesort.MergeSorterDirect;
import com.conacry.algorithms.sort.mergesort.MergeSorterReverse;
import com.conacry.algorithms.sort.quicksort.QuickSortDirect;
import com.conacry.algorithms.sort.quicksort.QuickSortReverse;

public class SorterFactory {

    public static Sorter getSorter(SorterType sorterType, Order order) {

        if (order == Order.DIRECT) {
            if (sorterType == SorterType.BUBBLE_SORT) {
                return new BubbleSorterDirect();
            }
            if (sorterType == SorterType.INSERTION_SORT) {
                return new InsertionSorterDirect();
            }
            if (sorterType == SorterType.MERGE_SORT) {
                return new MergeSorterDirect();
            }
            if (sorterType == SorterType.QUICK_SORT) {
                return new QuickSortDirect();
            }
        }

        if (order == Order.REVERSE) {
            if (sorterType == SorterType.BUBBLE_SORT) {
                return new BubbleSorterReverse();
            }
            if (sorterType == SorterType.INSERTION_SORT) {
                return new InsertionSorterReverse();
            }
            if (sorterType == SorterType.MERGE_SORT) {
                return new MergeSorterReverse();
            }
            if (sorterType == SorterType.QUICK_SORT) {
                return new QuickSortReverse();
            }
        }

        return null;
    }
}