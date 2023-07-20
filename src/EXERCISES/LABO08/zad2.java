package EXERCISES.LABO08;

import static EXERCISES.LABO08.zad1.splitToDigits;

public class zad2 {
    public static boolean isArmstrongNumber(int number) {
        int[] preparedNumber = splitToDigits(number);
        int calculatedNumber = 0;
        boolean isArmstrong = false;

        for (int i = 0; i < preparedNumber.length; i++) {
            calculatedNumber += Math.pow(preparedNumber[i], preparedNumber.length);
        }

        if (calculatedNumber == number)
            isArmstrong = true;

        return isArmstrong;
    }
}
