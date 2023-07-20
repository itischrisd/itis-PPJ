package EXERCISES.LABO10.zad4zad5;


import EXERCISES.LABO10.zad3.Tree;

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
