package com.conacry;

import java.util.Arrays;

import com.conacry.algorithms.sort.common.Order;
import com.conacry.algorithms.sort.Sorter;
import com.conacry.algorithms.sort.SorterFactory;
import com.conacry.algorithms.sort.common.SorterType;

public class App {

    public static void main( String[] args ) {
        long[] array = { 2, 1, 4, 6, 3, 5 };

        Sorter sorter = SorterFactory.getSorter(SorterType.MERGE_SORT, Order.REVERSE);
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
