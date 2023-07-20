package EXERCISES.LABO12.zad1;

public class DeciduousTree extends Tree {

    private int leavesShape;

    public DeciduousTree(int height, int leavesShape) {
        super(true, height, "lisciaste");
        this.leavesShape = leavesShape;
    }

    @Override
    public String toString() {
        return super.toString() + "DeciduoudTree{" +
                "leavedShape=" + leavesShape +
                '}';
    }
}
