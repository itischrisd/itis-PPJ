package EXERCISES.LABO10.zad3;

public class Tree {

    private boolean alwaysGreen;
    private int height;
    private String crossSection;

    public Tree(boolean alwaysGreen, int height, String crossSection) {
        this.alwaysGreen = alwaysGreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tree{" +
                "alwaysGreen=" + alwaysGreen +
                ", height=" + height +
                ", crossSection='" + crossSection + '\'' +
                '}';
    }
}
