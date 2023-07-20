package EXERCISES.LABO12.zad2;

public class DetektorDymu {

    public static void sprawdz(boolean czyDym) throws Alarm {
        if (czyDym) {
            throw new Alarm("Pali sie ratunku");
        }
    }
}
