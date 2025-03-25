package com.education.hszg.thi.search;

public class HashSearcher implements IntSearcher{

    int[] hashStorage;

    public void fill (int[] numbers, int Limit){

        hashStorage = new int[Limit];
        for (int i=0; i<Limit; i++)
            hashStorage[i] = 0;

        for (int number: numbers) {
            int position = number % Limit;
            while (hashStorage[position] != 0)
                position = (position+1) % Limit;

            hashStorage[position] = number;
        }

        System.out.println("HashStorage: ");
        for (int i=0; i<Limit; i++){
            System.out.println(i + ": " + hashStorage[i]);
        }

    }

    @Override
    public boolean find(int elementToFind, int[] numbers) {
        //ToDo HS
        return false;
    }

}
