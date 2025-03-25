package com.education.hszg.thi.search;

public class LinearSearch implements IntSearcher{

    @Override
    public boolean find(int elementToFind, int[] numbers) {

        for (int number : numbers) {
            if (number == elementToFind)
                return true;
        }
        return false;
    }
}
