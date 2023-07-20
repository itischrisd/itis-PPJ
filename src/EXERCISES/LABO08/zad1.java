package EXERCISES.LABO08;

public class zad1 {

    public static int[] splitToDigits(int inputNumber) {
        int helpNumber = inputNumber, count = 0;

        while (helpNumber != 0) {
            count++;
            helpNumber /= 10;
        }

        int[] returnNumber = new int[count];

        for (int i = 0; i < count; i++) {
            returnNumber[i] = inputNumber % 10;
            inputNumber /= 10;
        }

        return returnNumber;
    }

}
