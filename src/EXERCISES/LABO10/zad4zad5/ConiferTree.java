package EXERCISES.LABO10.zad4zad5;

import EXERCISES.LABO10.zad3.Tree;

public class ConiferTree extends Tree {

    protected int needleQuantity;
    protected double coneLength;

    public ConiferTree(int height, int needleQuantity, double coneLength) {
        super(true, height, "iglak");
        this.needleQuantity = needleQuantity;
        this.coneLength = coneLength;
    }

    @Override
    public String toString() {
        return super.toString() + "ConiferTree{" +
                "needleQuantity=" + needleQuantity +
                ", coneLength=" + coneLength +
                '}';
    }
}
