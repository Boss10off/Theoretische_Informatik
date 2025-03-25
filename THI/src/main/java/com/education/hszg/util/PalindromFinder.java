package com.education.hszg.util;

public class PalindromFinder {
    public boolean isPalindrome(String input) {
        if (input.length() < 2) return true;
        if (!input.substring(0, 1).equals(input.substring( input.length() - 1, input.length()))) return false;
        input = input.substring(1, input.length() - 1);
        return isPalindrome(input);
    }

    public boolean isPalindromRecursive(String input) {
        if (input.length() < 2) return true;
        String firstCharacter = input.substring(0, 1);
        String lastCharacter = input.substring(input.length() -1, input.length());
        if (!firstCharacter.equals(lastCharacter)) return false;
        return isPalindromRecursive(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
        PalindromFinder pf = new PalindromFinder();
        System.out.println("Test: abcd " + pf.isPalindrome("abcd"));
        System.out.println("Test: rentner " + pf.isPalindrome("rentner"));
        System.out.println("Test: renteer " + pf.isPalindrome("renteer"));
        System.out.println("Dozentenversion: ");
        System.out.println("Test: abcd " + pf.isPalindromRecursive("abcd"));
        System.out.println("Test: rentner " + pf.isPalindromRecursive("rentner"));
    }
}
