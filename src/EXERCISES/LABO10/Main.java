package EXERCISES.LABO10;


import EXERCISES.LABO10.zad1.Person;
import EXERCISES.LABO10.zad1.Welder;
import EXERCISES.LABO10.zad2.Jam;
import EXERCISES.LABO10.zad3.Tree;
import EXERCISES.LABO10.zad4zad5.ConiferTree;
import EXERCISES.LABO10.zad4zad5.DeciduousTree;
import EXERCISES.LABO10.zad4zad5.FruitTree;

public class Main {

    public static void main(String[] args) {
//        zad1
        Person osoba = new Person("Jasio");
        Welder spawacz = new Welder("Stasio", 5);

        System.out.println(osoba.getString());
        System.out.println(spawacz.getString());

//        zad2
        Jam owocowy = new Jam("owocowy", 75.5);
        Jam bezSmaku = new Jam(17.5);
        Jam bezWagi = new Jam("aksamitny");

        System.out.println(owocowy);
        System.out.println(bezSmaku);
        System.out.println(bezWagi);

//        zad3
        Tree drzewo = new Tree(false, 125, "nieznane");
        System.out.println(drzewo);

//        zad4zad5
        ConiferTree iglaste = new ConiferTree(17, 12345, 17.5);
        System.out.println(iglaste);

        DeciduousTree lisciaste = new DeciduousTree(47, 3);
        System.out.println(lisciaste);

        FruitTree owocowe = new FruitTree(31, "gruszka");
        System.out.println(owocowe);

//        zad5
        Tree[] magicznyLas = {drzewo, iglaste, lisciaste, owocowe,
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
        for (Tree tree : magicznyLas) {
            System.out.println(tree);
        }
    }
}
