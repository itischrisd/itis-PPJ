package EXERCISES.LABO09;


import EXERCISES.LABO09.zad1.Person;
import EXERCISES.LABO09.zad2.Fruit;
import EXERCISES.LABO09.zad3zad4.Balloon;
import EXERCISES.LABO09.zad3zad4.Donkey;
import EXERCISES.LABO09.zad5.Point2D;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        zad1
        Person person = new Person();

        person.name = "John";
        person.surname = "Doe";
        person.birthyear = 1966;

//        zad2
        Fruit apple = new Fruit("apple");
        apple.show();

//        zad3 zad4zad5
        Donkey donkey = new Donkey();

        if (donkey.isFlying())
            System.out.println("Ja latam!!!");
        else
            System.out.println("Jeszcze nie latam...");

        while (!donkey.isFlying()) {
            donkey.addBalloon(new Balloon());
        }

        if (donkey.isFlying())
            System.out.println("Ja latam!!!");
        else
            System.out.println("Jeszcze nie latam...");

//        zad5
        Point2D point2D = new Point2D();

        point2D.set(new int[]{1, 2, 1, 4});
        int[] pointArray = point2D.get();
        System.out.println(Arrays.toString(pointArray));
    }
}
