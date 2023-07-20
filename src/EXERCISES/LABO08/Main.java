package EXERCISES.LABO08;

import static EXERCISES.LABO08.zad1.splitToDigits;
import static EXERCISES.LABO08.zad2.isArmstrongNumber;
import static EXERCISES.LABO08.zad3.iterativeFactorial;
import static EXERCISES.LABO08.zad4.recursiveFactorial;
import static EXERCISES.LABO08.zad5.isCharArrayPalindrome;
import static EXERCISES.LABO08.zad6.printReversePalindrome;

public class Main {

    public static void main(String[] args) {
        int n = 153;

//        zad1
        int[] digits = splitToDigits(n);

        for (int digit : digits)
            System.out.print(digit + " ");

//        zad2
        System.out.println();
        boolean isArmstrong = isArmstrongNumber(n);

        if (isArmstrong)
            System.out.println(n + " is Armstrong number.");
        else
            System.out.println(n + " is not Armstrong number.");

//        zad3
        System.out.println("Iterative factorial of 7: " + iterativeFactorial(7));

//        zad4zad5
        System.out.println("Recursive factorial of 7: " + recursiveFactorial(7));

//        zad5
        String word = "level";
        char[] charArray = word.toCharArray();

        if (isCharArrayPalindrome(charArray, 0, charArray.length - 1))
            System.out.println(word + " is palindrome.");
        else
            System.out.println(word + " is not palindrome.");

//        zad6
        printReversePalindrome(charArray, charArray.length / 2 - 1);
    }
}
