package com.conacry;

import java.time.Duration;
import java.time.Instant;

import com.conacry.algorithms.sort.common.Order;
import com.conacry.algorithms.sort.Sorter;
import com.conacry.algorithms.sort.SorterFactory;
import com.conacry.algorithms.sort.common.SorterType;

public class App {

    public static void main( String[] args ) {

        long[] array = new long[1000];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = 1L + (long) (Math.random() * (1000000L - 1L));;
        }

        long[] array1 = array.clone();
        long[] array2 = array.clone();


        Sorter sorter = SorterFactory.getSorter(SorterType.QUICK_SORT, Order.DIRECT);
        
        Instant start = Instant.now();

        if (sorter != null) {
            sorter.sort(array1);
        }

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();

        System.out.println(timeElapsed);

        Sorter reverseSorter = SorterFactory.getSorter(SorterType.MERGE_SORT, Order.DIRECT);
        
        Instant secontStart = Instant.now();

        if (reverseSorter != null) {
            reverseSorter.sort(array2);
        }

        Instant secondfinish = Instant.now();
        long secondTimeElapsed = Duration.between(secontStart, secondfinish).toNanos();

        System.out.println(secondTimeElapsed);
    }
}
