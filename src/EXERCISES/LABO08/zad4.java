package EXERCISES.LABO08;

public class zad4 {
    public static int recursiveFactorial(int n) {
        if (n == 0) return 1;
        else return n * recursiveFactorial(n - 1);
    }
}
