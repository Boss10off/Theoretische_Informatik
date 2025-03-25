package com.education.hszg.thi.sort;

import com.google.common.base.Stopwatch;

import java.util.Random;

public class SortingCompetioion {
    public static void main(String[] args) {
        int LIMIT = 100_000;
        int[] bubbleNumbers = new int[LIMIT];
        int[] selectionNumbers = new int[LIMIT];

        Random random = new Random();
        for(int i = 0; i < LIMIT; i++){
            int temp = random.nextInt();
            bubbleNumbers[i] = temp;
            selectionNumbers[i] = temp;
        }
        IntSorter bubbleSort = new BubbleSort();
        IntSorter selectionSort = new SelectionSort();
        final Stopwatch stopWatch = Stopwatch.createStarted();
        stopWatch.stop();
        stopWatch.reset();
        stopWatch.start();
        bubbleSort.sort(bubbleNumbers);
        stopWatch.stop();
        System.out.println("BubbleSort needed: " + stopWatch.elapsed().getSeconds()+" seconds"); //funktioniert nicht, bei mir kommt immer 0sec

        stopWatch.reset();
        stopWatch.start();

        selectionSort.sort(selectionNumbers);
        stopWatch.stop();
        System.out.println("SelectionSort needed: " + stopWatch.elapsed().getSeconds()+" seconds");

    }


}
