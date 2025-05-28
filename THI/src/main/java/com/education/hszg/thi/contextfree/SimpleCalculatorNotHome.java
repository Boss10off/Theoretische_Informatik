package com.education.hszg.thi.contextfree;

import com.education.hszg.thi.contextfree.api.StringStack;
import com.education.hszg.thi.contextfree.impl.StringStackImplementation;

public class SimpleCalculatorNotHome{
    int calculate(String input){
        StringStack myCalculatorStack = new StringStackImplementation();

        for(int i = input.length()-1; i >= 0; i--){
            String sub = input.substring(i, i+1);
            if(sub.equals("+")){
                int i1 = Integer.parseInt(myCalculatorStack.pop());
                int i2 = Integer.parseInt(myCalculatorStack.pop());
                myCalculatorStack.push(""+(i1+i2));
            }
            else if(sub.equals("-")){
                int i1 = Integer.parseInt(myCalculatorStack.pop());
                int i2 = Integer.parseInt(myCalculatorStack.pop());
                myCalculatorStack.push(""+(i1-i2));
            }
            else myCalculatorStack.push(sub);
        }
        return Integer.parseInt(myCalculatorStack.pop());
    }
    public static void main(String[] args) {
        SimpleCalculatorNotHome calculator = new SimpleCalculatorNotHome();
        System.out.println("A simple prefix math calculator");
        System.out.println(
                "p2p35 == plus 2 (plus 3 5): " + calculator.calculate("+2+35")
        );
        System.out.println(
                "-9+3-42 == min 9 (plus 3 minus(4 2)) : " + calculator.calculate("-9+3-42")
        );
    }
}
