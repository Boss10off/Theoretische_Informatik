package com.education.hszg.thi.sort;

import java.util.Arrays;

public class BubbleSort implements IntSorter {
    @Override
    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }

        }
        return numbers;
    }


    public static void main(String[] args) {
        IntSorter bubblesort = new BubbleSort();
        int[] numbers = {1,9,5,8,22,66,31,63};
        System.out.println("Before Sorting");

        Arrays.stream(numbers)
                .forEach(System.out::println);
        numbers = bubblesort.sort(numbers);

        System.out.println("After Sorting");

        Arrays.stream(numbers)
                .forEach(System.out::println);
    }
}
