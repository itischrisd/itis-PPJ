package EXERCISES.LABO10.zad2;

public class Jam {

    private String taste;
    private double weight;

    public Jam(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }

    public Jam(double weight) {
        this("No name", weight);
//        this.weight = weight;
//        this.taste = "No name";
    }

    public Jam(String taste) {
        this(taste, 100.0);
//        this.taste = taste;
//        this.weight = 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Jam{" +
                "taste='" + taste + '\'' +
                ", weight=" + weight +
                '}';
    }
}
