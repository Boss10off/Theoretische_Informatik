package com.education.hszg.thi.sort;

import java.util.Arrays;

public class SelectionSort implements IntSorter{
    @Override
    public int[] sort(int[] numbers) {

        int actualPos;
        int minPos;

        for(int i = 0; i < numbers.length-1; i++){
            minPos = i;
            for(int j = i+1; j < numbers.length; j++)
                if(numbers[j] < numbers[minPos])
                    minPos = j;
            int temp = numbers[i];
            numbers[i] = numbers[minPos];
            numbers[minPos] = temp;
        }

        return numbers;
    }
    public static void main(String[] args) {
        IntSorter selectionSort = new SelectionSort();
        int[] numbers = {1,9,5,8,22,66,31,63};
        System.out.println("Before Sorting");

        Arrays.stream(numbers)
                .forEach(System.out::println);

        numbers = selectionSort.sort(numbers);

        System.out.println("After Sorting");

        Arrays.stream(numbers)
                .forEach(System.out::println);
    }

}
