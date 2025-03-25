package com.education.hszg.thi;

public class Odd2 {

    boolean isOdd(int i) {
        i = 2 * i;
        i = i / 2;
        i = 2 * i;
        i = i / 2;


        return i % 2 == 1;
    }

    public static void main(String[] args) {
        Odd2 myOddCalculator = new Odd2();
        System.out.println("Sind Zahlen Ungerade?");
        System.out.println("23:" +myOddCalculator.isOdd(23));
        System.out.println("230:" +myOddCalculator.isOdd(230));
    }
}
