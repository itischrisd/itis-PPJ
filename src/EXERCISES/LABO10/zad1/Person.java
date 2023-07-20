package EXERCISES.LABO10.zad1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getString() {
        return super.toString() + " -> imie: " + this.name;
    }
}
