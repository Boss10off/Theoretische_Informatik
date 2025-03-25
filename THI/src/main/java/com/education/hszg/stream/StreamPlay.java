package com.education.hszg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPlay {

    boolean hasThreeAsADigit(int number) {
        if (number == 0) return true;
        if (number % 10 == 3) return false;

        return hasThreeAsADigit(number/10);
    }

    int doubler(int number) {
        return number * 2;
    }

    public void workingWithAStream() {
        // List of Integers, convert to Stream

        List<Integer> myNumbers = Arrays.asList(1, 3, 5, -7, 7, 423, 6, 5, -4, 34, 45, -7, 44, 32, 4, 6, 4, 3, 2);

        System.out.println("The list of numbers printed in a boring way.");
        for (Integer myNumber : myNumbers) {
            System.out.print(myNumber + " ");
        }
        System.out.println();

        System.out.println("The list of numbers printed in a nice way.");
        myNumbers.forEach(i -> System.out.print(i + " "));

        System.out.println();

        List<Integer> mySortedList =
                myNumbers
                .stream()
                .sorted()
                .toList();
        System.out.println("The largest element in the list is: " + mySortedList.get(mySortedList.size() - 1));


        System.out.println();

        mySortedList =
                myNumbers
                        .stream()
                        .sorted()
                        .toList();
        System.out.println("The second smallest element in the list is: " + mySortedList.get(1));

        System.out.println();

        mySortedList =
                myNumbers
                        .stream()
                        .distinct()
                        .sorted()
                        .toList();
        System.out.println("The second smallest element in the list without the duplicates is: " + mySortedList.get(1));

        System.out.println();

        mySortedList =
                myNumbers
                        .stream()
                        .filter(a -> a>0)
                        .distinct()
                        .sorted()
                        .toList();
        System.out.println("The second smallest element in the list without the duplicates and negatives is: " + mySortedList.get(1));

        System.out.println();

        mySortedList =
                myNumbers
                        .stream()
                        .filter(a -> a>0)
                        .filter(a -> a%2 == 0)
                        .distinct()
                        .sorted()
                        .toList();
        System.out.println("The second smallest element in the list without the duplicates and negatives and without odd numbers is: " + mySortedList.get(1));

        System.out.println();

        List<Integer> myNumbersWithout3Digit =
                myNumbers
                        .stream()
                        .filter(this::hasThreeAsADigit)
                        .toList();
        System.out.println("The elements in the list witch contain no 3 as a digit are: ");
        myNumbersWithout3Digit.forEach(i -> System.out.print(i + " "));
        List<Integer> myNumbersWithout3Digit2 =
                myNumbers
                        .stream()
                        .filter(this::hasThreeAsADigit)
                        .map(this::doubler)
                        .toList();
        System.out.println("The elements in the list witch contain no 3 as a digit are: ");
        myNumbersWithout3Digit2.forEach(i -> System.out.print(i + " "));

    }

    public static void main(String[] args) {
        StreamPlay mystreamPlay = new StreamPlay();
        mystreamPlay.workingWithAStream();
    }
}
