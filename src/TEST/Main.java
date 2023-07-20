package TEST;

public class Main {

    public static void main(String[] args) {

        A[] arrA = new A[]{new B(), new B(4, 1), new A(), new A(2)};

        for (int i = 0; i < arrA.length; i++) {
            arrA[i].met1((char) ('d' + i));
            arrA[i].met2();
            System.out.println();
        }
    }
}

class A {

    private char[][] arr;

    public A(int size) {
        arr = new char[size][size];
    }

    public A() {
        this(3);
    }

    public void met1(char c) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) (c + (j % 2 == 0 ? i * j : j));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected char[] met2() {

        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char m = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                m = m < arr[i][j] ? arr[i][j] : m;
            }
            result[i] = (char) (m + 1);
            System.out.print((char) (m + 1) + " ");
        }
        System.out.println();
        return result;
    }
}

class B extends A {

    private int s;

    public B(int size, int s) {
        this.s = s;
    }

    public B() {
        super(1);
    }

    protected char[] met2() {

        char[] result = super.met2();
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (result[i] + (s + 2));
            System.out.print(result[i] + " ");
        }
        System.out.println();

        return result;
    }
}