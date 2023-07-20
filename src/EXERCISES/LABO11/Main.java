package EXERCISES.LABO11;


import EXERCISES.LABO11.zad1.Ciastko;
import EXERCISES.LABO11.zad2.FabrykaCiastek;
import EXERCISES.LABO11.zad2.Kontener;
import EXERCISES.LABO11.zad3.MagazynTablicowy;
import EXERCISES.LABO11.zad4.MagazynListowy;

public class Main {

    public static void main(String[] args) {

//        zad1
        System.out.println("\nzad1");
        Ciastko orzechowe = new Ciastko("orzechowe", 17.5);
        System.out.println(orzechowe.show());

//        zad2
        System.out.println("\nzad2");
        System.out.println(FabrykaCiastek.przygotuj(1));
        System.out.println(FabrykaCiastek.przygotuj(2));
        System.out.println(FabrykaCiastek.przygotuj(1));
        System.out.println(FabrykaCiastek.przygotuj(2));
        System.out.println(FabrykaCiastek.przygotuj(3));
        System.out.println(FabrykaCiastek.przygotuj(3));

        Kontener kontener = new Kontener(50);
        kontener.zaladuj(orzechowe, 10);
        System.out.println(kontener.sprawdzPrzydatnosc());
        System.out.println(kontener);

//        zad3
        System.out.println("\nzad3");
        MagazynTablicowy magazynTablicowy = new MagazynTablicowy();

        magazynTablicowy.przyjmijKontener(new Kontener(100));
        magazynTablicowy.przyjmijKontener(new Kontener(200));
        magazynTablicowy.przyjmijKontener(new Kontener(300));

        System.out.println(magazynTablicowy);

        System.out.println(magazynTablicowy.wydajKontener());

        System.out.println(magazynTablicowy);

//        zad4
        System.out.println("\nzad4");
        MagazynListowy magazynListowy = new MagazynListowy();

        magazynListowy.przyjmijKontener(new Kontener(100));
        magazynListowy.przyjmijKontener(new Kontener(200));
        magazynListowy.przyjmijKontener(new Kontener(300));

        magazynListowy.show();
        System.out.println("Wydany kontener: " + magazynListowy.wydajKontener());
        magazynListowy.show();
    }
}
