package EXERCISES.LABO09.zad3zad4;

public class Balloon {
    private double helium = 0.005 + Math.random() * 0.009;

    public double getLoad() {
        return 9.0 * this.helium / 0.001;
    }
}
