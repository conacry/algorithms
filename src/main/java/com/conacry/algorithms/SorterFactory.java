package com.conacry.algorithms;

import com.conacry.algorithms.bubblesort.BubbleSortDirect;
import com.conacry.algorithms.bubblesort.BubbleSortReverse;

public class SorterFactory {

    public static Sorter getSorter(SorterType sorterType, Order order) {
        if (sorterType == SorterType.BUBBLE_SORT) {
            if(order == Order.DIRECT) {
                return new BubbleSortDirect();
            }
            if(order == Order.REVERSE) {
                return new BubbleSortReverse();
            }
        }
        return null;
    }
}