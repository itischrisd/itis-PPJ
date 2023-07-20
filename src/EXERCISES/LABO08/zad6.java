package EXERCISES.LABO08;

public class zad6 {

    public static void printReversePalindrome(char[] word, int middleIndex) {

        if (middleIndex < 0) return;

        System.out.print(word[middleIndex]);
        printReversePalindrome(word, middleIndex - 1);
        System.out.print(word[word.length - 1 - middleIndex]);
    }
}
