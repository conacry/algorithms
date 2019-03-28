package com.conacry.algorithms.bubblesort;

import com.conacry.algorithms.Order;
import com.conacry.algorithms.Sorter;
import com.conacry.algorithms.SorterFactory;
import com.conacry.algorithms.SorterType;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SorterTest {

    @Test
    public void sort_getBubbleSort_sortedDirectArray() {
        long[] array = { 2, 1, 4, 6, 3, 5 };
        long[] sortedArray = { 1, 2, 3, 4, 5, 6 };

        Sorter sorter = SorterFactory.getSorter(SorterType.BUBBLE_SORT, Order.DIRECT);
        sorter.sort(array);
        
        Assert.assertEquals(array, sortedArray);
    }

    @Test
    public void sort_getBubbleSort_sortedReverceArray() {
        long[] array = { 2, 1, 4, 6, 3, 5 };
        long[] sortedArray = { 6, 5, 4, 3, 2, 1 };

        Sorter sorter = SorterFactory.getSorter(SorterType.BUBBLE_SORT, Order.REVERSE);
        sorter.sort(array);

        Assert.assertEquals(array, sortedArray);
    }
}