package com.education.hszg.thi.search;

import java.util.Arrays;
import java.util.Random;

public class SearchCompetition {
    public static void main(String[] args) {
        IntSearcher linearSearch = new LinearSearch();
        IntSearcher logarithmicSearch = new LogarithmicSearch();
        HashSearcher hashSearch = new HashSearcher();
        Random myRandomNumber = new Random();

        final int LIMIT = 4;
        int[] numbersLS = new int[LIMIT];
        int[] numbersLogS = new int[LIMIT];
        int[] numbersHashS = new int[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            int t = myRandomNumber.nextInt(1, 10_000_000);
            numbersLS[i] = t;
            numbersLogS[i] = t;
            numbersHashS[i]=t;
        }

        Arrays.sort(numbersLogS);
        hashSearch.fill(numbersHashS,4);
//        System.out.println("Linear Search ");
//        System.out.println("Numbers: ");
//        for(int e: numbersLS)
//            System.out.println(e + "");
//        System.out.println("Find Element 234:  " + linearSearch.find(234, numbersLS));
//
//        System.out.println("Logarithmic Search ");
//        System.out.println("Numbers: ");
//        for(int e: numbersLogS)
//            System.out.println(e + "");
//        System.out.println("Find Element 234:  " + logarithmicSearch.find(234, numbersLogS));

//        long LS_before = System.nanoTime();
//        linearSearch.find(234,numbersLS);
//        long LS_after = System.nanoTime();
//
//        long LogS_before = System.nanoTime();
//        logarithmicSearch.find(234,numbersLogS);
//        long LogS_after = System.nanoTime();
//
//        System.out.println("Competition for 100.000.000 Elements ");
//        System.out.println("Linear Search needs " + (LS_after-LS_before) + "ns");
//        System.out.println("Logarithmic Search needs "+ (LogS_after - LogS_before) + "ns");
    }
}
