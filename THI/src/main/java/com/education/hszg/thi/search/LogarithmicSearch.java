package com.education.hszg.thi.search;

public class LogarithmicSearch implements IntSearcher{

    boolean find(int elementToFind, int[] numbers, int left, int right) {
        //int pivot = (left + right) / 2;
        int pivot = left + (right-left)/2;
        if (left == right) return false;
        if (numbers[pivot] == elementToFind) return true;
        if (numbers[pivot] < elementToFind)
            return find(elementToFind, numbers, left, pivot - 1);
        return find(elementToFind, numbers, pivot + 1, right);
    }


    @Override
    public boolean find(int elementToFind, int[] numbers) {
        return
                find(elementToFind, numbers, 0, numbers.length - 1);
    }
}
