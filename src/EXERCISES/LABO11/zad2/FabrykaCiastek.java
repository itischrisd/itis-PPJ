package EXERCISES.LABO11.zad2;


import EXERCISES.LABO11.zad1.Ciastko;

public class FabrykaCiastek {

    private static Ciastko c1 = null, c2 = null;

    public static Ciastko przygotuj(int nr) {
        if (nr == 1) {
            if (c1 == null) {
                c1 = new Ciastko("jablko", 100);
            }
            return c1;
        } else if (nr == 2) {
            if (c2 == null) {
                c2 = new Ciastko("mango", 200);
            }
            return c2;
        } else
            return new Ciastko("smak nr " + nr, Math.random() * nr);
    }
}
