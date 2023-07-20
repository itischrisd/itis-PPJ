package EXERCISES.LABO08;

public class zad3 {
    public static int iterativeFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;

        return f;
    }
}
