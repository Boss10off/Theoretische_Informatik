package com.education.hszg.thi;

public class Palindrome {


    /*boolean isPalindrome(String word) {
        if (word.length() < 2) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        for (int i = 1; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i - 1)) return false;
        }
        return true;
    }*/

    boolean isPalindrome(String word) {
        System.out.println("Zu testendes Wort" + word);

        if (word.length() < 2) return true;

        if (word.substring(0,1).equals(word.substring(word.length()-1)))
                return isPalindrome(word.substring(1, word.length()-1));
        return false;
    }


    public static void main(String[] args) {
        Palindrome myPalindrome = new Palindrome();
        System.out.println(("Test"));
        System.out.println("a:" +myPalindrome.isPalindrome("a"));
        System.out.println("leeres Wort:" +myPalindrome.isPalindrome(""));
        System.out.println("rentner:" +myPalindrome.isPalindrome("rentner"));
        System.out.println("halunkah:" +myPalindrome.isPalindrome("halunkah"));
    }
}
