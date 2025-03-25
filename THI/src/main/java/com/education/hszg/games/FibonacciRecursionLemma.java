package com.education.hszg.games;

import com.education.hszg.structures.api.NoDirectAccessIntegerStorage;
import com.education.hszg.structures.impl.IntegerQueue;

public class FibonacciRecursionLemma {
    public int getRecursiveFibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return getRecursiveFibonacci(n-1)+ getRecursiveFibonacci(n-2);
    }

    public int iterativeConvertedFibonacci(int n) {
        NoDirectAccessIntegerStorage myQueue = new IntegerQueue();
        int result = 0;
        myQueue.init();
        myQueue.push(n);

        while (!myQueue.isEmpty()) {
            int temp = myQueue.pop();
            //if (temp == 0) { }
            if (temp == 1) {result += 1;}
            if (temp >= 1) {
                myQueue.push(temp-1);
                myQueue.push(temp-2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciRecursionLemma myFib = new FibonacciRecursionLemma();
        System.out.println("Fib recursive of 40: " + myFib.getRecursiveFibonacci(40));
        System.out.println("Fib iterative of 40: " + myFib.iterativeConvertedFibonacci(40));
    }
}
