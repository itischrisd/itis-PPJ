package EXERCISES.LABO08;

public class zad5 {

    public static boolean isCharArrayPalindrome(char[] word, int firstIndex, int lastIndex) {
        if (word[firstIndex] != word[lastIndex])
            return false;
        else
            if (firstIndex == lastIndex || firstIndex == lastIndex+1)
                return true;
            else
                return isCharArrayPalindrome(word, ++firstIndex, --lastIndex);
    }

}
