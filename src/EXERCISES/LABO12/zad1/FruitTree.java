package EXERCISES.LABO12.zad1;

public class FruitTree extends Tree {

    private String fruitName;

    public FruitTree(int height, String fruitName) {
        super(false, height, "lisciaste");
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return super.toString() + "FruitTree{" +
                "fruitName='" + fruitName + '\'' +
                '}';
    }

    @Override
    public void pickFruit() {
        System.out.println(fruitName);
    }
}
