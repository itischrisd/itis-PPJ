package EXERCISES.LABO11.zad2;


import EXERCISES.LABO11.zad1.Ciastko;

public class Kontener {

    private Ciastko ladunek;
    private double masaLadunku;
    private int dniPrzydatnosci;

    public Kontener(double masaLadunku) {
        this.masaLadunku = masaLadunku;
    }

    public void zaladuj(Ciastko ladunek, int dniPrzydatnosci) {
        this.ladunek = ladunek;
        this.dniPrzydatnosci = dniPrzydatnosci;
    }

    public boolean sprawdzPrzydatnosc() {
        if (this.dniPrzydatnosci > 0)
            return true;
        else
            return false;
    }

    public double getMasaLadunku() {
        return masaLadunku;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Kontener{" +
                "ladunek=" + ladunek +
                ", masaLadunku=" + masaLadunku +
                ", dniPrzydatnosci=" + dniPrzydatnosci +
                '}';
    }
}
