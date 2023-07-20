package EXERCISES.LABO12;


import EXERCISES.LABO12.zad1.*;
import EXERCISES.LABO12.zad2.Alarm;
import EXERCISES.LABO12.zad2.DetektorDymu;
import EXERCISES.LABO12.zad3.BoomException;
import EXERCISES.LABO12.zad3.Rakieta;

public class Main {

    public static void main(String[] args) {
        //zad1
        Tree drzewo = new Tree(false, 125, "nieznane");
        System.out.println(drzewo);

        ConiferTree iglaste = new ConiferTree(17, 12345, 17.5);
        System.out.println(iglaste);

        DeciduousTree lisciaste = new DeciduousTree(47, 3);
        System.out.println(lisciaste);


        FruitTree owocowe = new FruitTree(31, "gruszka");
        System.out.println(owocowe);

        Tree[] forest = {drzewo, iglaste, lisciaste, owocowe,
                new Tree(true, 153, "magiczne"),
                new Tree(true, 41, "sosna"),
                new Tree(false, 32, "modrzew"),
                new Tree(false, 24, "dab"),
                new Tree(false, 61, "osika"),
                new ConiferTree(41, 999, 15.7),
                new DeciduousTree(17, 5),
                new FruitTree(51, "banan"),
                new FruitTree(52, "morela"),
                new FruitTree(21, "sliwa")
        };

        System.out.println();
        for (Tree tree : forest) {
            System.out.println(tree);
        }

        for (Tree tree : forest) {
            try {
                tree.pickFruit();
            } catch (DrzewoBezOwocoweException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();

        //zad2
        try {
            DetektorDymu.sprawdz(false);
            System.out.println("Nic sie nie pali");
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }

        try {
            DetektorDymu.sprawdz(true);
            System.out.println("Nic sie nie pali");
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }

        System.out.println();

        //zad3
        Rakieta rakieta = new Rakieta("The tip is pointy");

        for (int j = 1; j <= 10; j++) {
            System.out.println("Misja w kosmos nr" + j);
            try {
                for (int i = 0; i <= 15; i++)
                    rakieta.zatankuj();
                rakieta.start();
            } catch (BoomException boomException) {
                System.out.println(boomException.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("You're not Elon Musk, you know?");
            }
            System.out.println();
        }

    }
}
