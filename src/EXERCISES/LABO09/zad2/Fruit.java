package EXERCISES.LABO09.zad2;

public class Fruit {
    String name;
    double weight = 0.5 + Math.random() * 0.3;

    public Fruit(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Fruit is " + this.name + " and wieghts " + this.weight);
    }
}
