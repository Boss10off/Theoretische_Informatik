package com.education.hszg.thi.automata;

public class DIVIDES_3_4_BOTH {


    boolean run(int state, String word) {
        if (word.isEmpty()){
            return (state == 3)||(state == 7);
        }
        switch (state) {
            case 0:
                if (word.charAt(0)=='a')
                    return run(1,word.substring(1))||run(4,word.substring(1));
            case 1:
                if (word.charAt(0)=='a') return run(2,word.substring(1));
            case 2:
                if (word.charAt(0)=='a') return run(3,word.substring(1));
            case 3:
                if (word.charAt(0)=='a') return run(1,word.substring(1));
            case 4:
                if (word.charAt(0)=='a') return run(5,word.substring(1));
            case 5:
                if (word.charAt(0)=='a') return run(6,word.substring(1));
            case 6:
                if (word.charAt(0)=='a') return run(7,word.substring(1));
            case 7:
                if (word.charAt(0)=='a') return run(4,word.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        DIVIDES_3_4_BOTH d = new DIVIDES_3_4_BOTH();
        String word = "aaa";
        System.out.println("Can " + word + "be divided by 3 or 4 or both " + d.run(0,word));
        word = "aa";
        System.out.println("Can " + word + "be divided by 3 or 4 or both " + d.run(0,word));
        word = "aaaa";
        System.out.println("Can " + word + "be divided by 3 or 4 or both " + d.run(0,word));
        word = "aaaaaaaaa";
        System.out.println("Can " + word + "be divided by 3 or 4 or both " + d.run(0,word));
    }
}
