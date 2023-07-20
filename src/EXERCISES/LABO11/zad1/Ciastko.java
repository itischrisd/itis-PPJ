package EXERCISES.LABO11.zad1;

public class Ciastko {

    private String smak;
    private double waga;

    public Ciastko(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public String show() {
        return "Ciastko{" +
                "smak='" + smak + '\'' +
                ", waga=" + waga +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + " -> Ciastko{" +
                "smak='" + smak + '\'' +
                ", waga=" + waga +
                '}';
    }
}
