package com.education.hszg.thi.contextfree;

import java.util.Stack;

public class SimpleCalculator {
    int calculate(String formula) {
        Stack stack = new Stack();
        return 0;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("A simple prefix math calculator");
        System.out.println(
                "p2p35 == plus 2 (plus 3 5): " + calculator.calculate("p2p35")
        );
        System.out.println(
                "-9+3+42 == min 9 (plus 3 minus(4 2)) : " + calculator.calculate("-9+3+42")
        );
    }
}
