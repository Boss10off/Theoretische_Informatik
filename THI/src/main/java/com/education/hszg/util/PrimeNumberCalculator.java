package com.education.hszg.util;

public class PrimeNumberCalculator {
    public static boolean primeTest(int b) {
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean primeTestRecursive(int b, int pivot) {
        if (pivot == 1 ) return true;
        if (b % pivot == 0) return false;
        return primeTestRecursive(b, pivot-1);
    }
    public static void primeFind (int n) {
        for (int i = 2; i < n; i++) {
            boolean prime = primeTest(i);
            if (prime) {
                System.out.println(i);
            }
        }
    }
    public void printAllPrimeNumbersUntilN(int n) {
        for (int i = 2; i < n; i++) {
            System.out.println(i + " is prime number " + primeTestRecursive(i, i-1));
        }
    }

    public static void main(String[] args) {
        primeFind(25);
        System.out.println("iterativ beendet");
        PrimeNumberCalculator pnc = new PrimeNumberCalculator();
        System.out.println("25 " + pnc.primeTestRecursive(25, 24));
        System.out.println("29 " + pnc.primeTestRecursive(29, 28));
        pnc.printAllPrimeNumbersUntilN(25);
    }
}
