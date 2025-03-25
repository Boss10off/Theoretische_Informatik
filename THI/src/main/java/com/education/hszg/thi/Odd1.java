package com.education.hszg.thi;

public class Odd1 {

    boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void main(String[] args) {
        Odd1 myOddCalculator = new Odd1();
        System.out.println("Sind Zahlen Ungerade?");
        System.out.println("23:" +myOddCalculator.isOdd(23));
        System.out.println("230:" +myOddCalculator.isOdd(230));
    }
}
