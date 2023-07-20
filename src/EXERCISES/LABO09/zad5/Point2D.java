package EXERCISES.LABO09.zad5;

public class Point2D {
    private int x, y;

    public int[] get() {
        return new int[]{this.x, this.y, 1};
    }

    public void set(int[] arr) {
        this.x = arr[0];
        this.y = arr[1];
    }
}
