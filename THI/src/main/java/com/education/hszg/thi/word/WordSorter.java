package com.education.hszg.thi.word;

public class WordSorter {
    public static void main(String[] args) {

        String a = "aa";
        String b = "bb";
        System.out.println(a+ " " + b + ": " + WordSorter.llo(a,b));

        a = "zzz";
        b = "agazaga";
        System.out.println(a+ " " + b + ": " + WordSorter.llo(a,b));

        a = "zaaaz";
        b = "zz";
        System.out.println(a+ " " + b + ": " + WordSorter.llo(a,b));

        a = "zzz";
        b = "zzz";
        System.out.println(a+ " " + b + ": " + WordSorter.llo(a,b));
    }

    public static boolean llo(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return true;
        }
        if (word1.length() == word2.length()) {
            return word1.compareTo(word2)<1;
        }

        return false;
    }
}
