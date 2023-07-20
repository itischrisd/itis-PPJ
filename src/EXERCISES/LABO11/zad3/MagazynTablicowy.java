package EXERCISES.LABO11.zad3;


import EXERCISES.LABO11.zad2.Kontener;

import java.util.Arrays;

public class MagazynTablicowy {

    private Kontener[] magazyn = new Kontener[5];

    public void przyjmijKontener(Kontener kontener) {
        for (int i = 0; i < magazyn.length; i++) {
            if (magazyn[i] == null) {
                magazyn[i] = kontener;
                break;
            }
        }
    }

    public Kontener wydajKontener() {
        Kontener tmp = null;
        for (int i = magazyn.length - 1; i >= 0; i--) {
            if (magazyn[i] != null) {
                tmp = magazyn[i];
                magazyn[i] = null;
                break;
            }
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "MagazynTablicowy{" +
                "magazyn=" + Arrays.toString(magazyn) +
                '}';
    }
}
