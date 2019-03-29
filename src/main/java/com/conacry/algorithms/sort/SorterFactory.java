package com.conacry.algorithms.sort;

import com.conacry.algorithms.sort.bubblesort.BubbleSorterDirect;
import com.conacry.algorithms.sort.bubblesort.BubbleSorterReverse;
import com.conacry.algorithms.sort.common.Order;
import com.conacry.algorithms.sort.common.SorterType;
import com.conacry.algorithms.sort.insertionsort.InsertionSorterDirect;
import com.conacry.algorithms.sort.insertionsort.InsertionSorterReverse;

public class SorterFactory {

    public static Sorter getSorter(SorterType sorterType, Order order) {

        if (order == Order.DIRECT) {
            if (sorterType == SorterType.BUBBLE_SORT) {
                return new BubbleSorterDirect();
            }
            if (sorterType == SorterType.INSERTION_SORT) {
                return new InsertionSorterDirect();
            }
        }

        if (order == Order.REVERSE) {
            if (sorterType == SorterType.BUBBLE_SORT) {
                return new BubbleSorterReverse();
            }
            if (sorterType == SorterType.INSERTION_SORT) {
                return new InsertionSorterReverse();
            }
        }

        return null;
    }
}