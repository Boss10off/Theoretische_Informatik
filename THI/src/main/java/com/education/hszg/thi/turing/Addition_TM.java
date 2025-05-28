package com.education.hszg.thi.turing;

public class Addition_TM {

    boolean run(CharStack left,int state,CharStack right) {
        if ((state == 1) && (right.top() == 'a')) {
            right.pop();
            return run(left,2,right);
        }
        if ((state == 2) && (right.top() == 'a')) {
            left.push(right.pop());
            return run(left,state,right);
        }
        if ((state == 2) && (right.top() == 'b')) {
            right.pop();
            right.push('a');
            return run(left,3,right);
        }
        if ((state == 3) && (right.top() == 'a')) {
            if (left.isEmpty()) left.push(' ');
            right.push(left.pop());
            return run(left,state,right);
        }
        if ((state == 3) && (right.top() == ' ')) {
            left.push(right.pop());
            return run(left,4,right);
        }
        if (state == 4) {
            while(!right.isEmpty()) {
                System.out.println("Char: " + right.pop());
            }
            return true;
        }
        return false;
    }


    //(w1,state,w2)

    public static void main(String[] args) {
        Addition_TM myAddition_TM = new Addition_TM();
        //state
        CharStack left = new CharStackImplementation();
        int startstate = 1;
        CharStack right = new CharStackImplementation();
        String s = "aabaaa";
        for (int i = s.length()-1; i>=0; i--) {
            right.push(s.charAt(i));
        }
        myAddition_TM.run(left, startstate, right);

    }
}
