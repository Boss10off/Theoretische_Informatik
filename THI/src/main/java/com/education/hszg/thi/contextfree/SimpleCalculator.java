package com.education.hszg.thi.contextfree;

import com.education.hszg.thi.contextfree.api.CharStack;
import com.education.hszg.thi.contextfree.impl.CharacterStack;

public class SimpleCalculator {
    int calculate(String formula) {
        char[] chars = formula.toCharArray();
        for(char c : chars) System.out.println(c);
        CharStack myStack = new CharacterStack();
        myStack.init();
        for (char c : chars) {
            myStack.push(c);
        }
        int temp = 0;
        int temp2 = 0;
        int times=1;
        while (!myStack.isEmpty()) {
            char next = myStack.pop();
            switch (next) {
                case '+': case 'p':
                    temp += temp2;
                    times=1;
                    temp2=0;
                    break;
                case '-':case 'm':
                    temp -= temp2;
                    times=1;
                    temp2=0;
                    break;
                case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
                    temp2 +=((next -'0')*times);
                    times*=10;
                    break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("A simple prefix math calculator");
        System.out.println(
                "p2p35 == plus 2 (plus 3 5): " + calculator.calculate("p2p35")
        );
        System.out.println(
                "-9+3+42 == min 9 (plus 3 minus(4 2)) : " + calculator.calculate("-9+3-42")
        );
    }
}