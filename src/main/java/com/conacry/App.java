package com.conacry;

import java.util.Arrays;

import com.conacry.algorithms.Order;
import com.conacry.algorithms.Sorter;
import com.conacry.algorithms.SorterFactory;
import com.conacry.algorithms.SorterType;

public class App {

    public static void main( String[] args ) {
        long[] array = { 2, 1, 4, 6, 3, 5 };

        Sorter sorter = SorterFactory.getSorter(SorterType.BUBBLE_SORT, Order.REVERSE);
        sorter.sort(array);
        System.out.println(Arrays.toString(array));

        sorter = SorterFactory.getSorter(SorterType.BUBBLE_SORT, Order.DIRECT);
        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
