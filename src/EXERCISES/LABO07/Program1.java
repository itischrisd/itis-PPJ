package EXERCISES.LABO07;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 9 + 2);
        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Tablica wspolrzednych:");
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 21 - 10);
            y[i] = (int) (Math.random() * 21 - 10);
            System.out.print("{" + x[i] + ", " + y[i] + "} ");
        }
        System.out.println();

        int maxX = x[0], maxY = y[0], minX = x[0], minY = y[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] < minX) minX = x[i];
            if (x[i] > maxX) maxX = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] < minY) minY = y[i];
            if (y[i] > maxY) maxY = y[i];
        }
        System.out.println();
        int wysokosc = maxY - minY;
        int szerokosc = maxX - minX;
        double srodekX = minX + szerokosc / 2.0;
        double srodekY = minY + wysokosc / 2.0;
        System.out.println("Prostokat ma wysokosc " + wysokosc + ", szerokosc " + szerokosc);
        System.out.println("A jego srodek ma wspolrzedne " + srodekX + ", " + srodekY);

    }
}

class Program2 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int newLength = 0;

        for (int i = 0; i < tab.length; i++) {
            newLength += tab[i].length;
        }

        int[] newTab = new int[newLength];
        for (int i = 0, k = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++, k++) {
                newTab[k] = tab[i][j];
            }
        }

        for (int foo : newTab) {
            System.out.print(foo + " ");
        }
    }
}

class Program3 {
    public static void main(String[] args) {
        int[] tab1 = new int[(int) (Math.random() * 11)];
        int[] tab2 = new int[(int) (Math.random() * 11)];
        int[] tab3 = new int[(int) (Math.random() * 11)];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = (int) (Math.random() * 10);
        }

        int[][] tabAll = {tab1, tab2, tab3};

        for (int[] foo : tabAll) {
            for (int bar : foo) {
                System.out.print(bar + " ");
            }
            System.out.println();
        }
    }
}

class Program4 {
    public static void main(String[] args) {
        float[][] kwadrat = new float[8][8];
        float sumaLewa = 0, sumaPrawa = 0;

        for (int i = 0; i < kwadrat.length; i++) {
            for (int j = 0; j < kwadrat[i].length; j++) {
                kwadrat[i][j] = (float) (Math.random() * 10);
                if (i == j) sumaLewa += kwadrat[i][j];
                if ((i + j + 1) == kwadrat.length) sumaPrawa += kwadrat[i][j];
            }
        }

        System.out.println("Suma lewej przekatnej: " + sumaLewa);
        System.out.println("Suma prawej przekatnej: " + sumaPrawa);
        System.out.println("Suma obu: " + (sumaLewa + sumaPrawa));
    }
}

class Program5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {7, 6, 5, 4, 3, 2};
        int[] c = new int[b.length + a.length];

        int tempFromA = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
        int tempIndexA = a.length - 1;
        int tempFromB = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
        int tempIndexB = 0;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < a.length || j < b.length; j++) {
                if (j < a.length && a[j] < tempFromA) {
                    tempFromA = a[j];
                    tempIndexA = j;
                }

                if (j < b.length && b[j] < tempFromB) {
                    tempFromB = b[j];
                    tempIndexB = j;
                }
            }
            if (tempFromA < tempFromB) {
                c[i] = tempFromA;
                a[tempIndexA] = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
                tempFromA = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
                tempIndexA = a.length - 1;
            } else {
                c[i] = tempFromB;
                b[tempIndexB] = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
                tempFromB = a[a.length - 1] > b[0] ? a[a.length - 1] : b[0];
                tempIndexB = 0;
            }
        }

        System.out.println(Arrays.toString(c));

    }
}

class Program6 {
    public static void main(String[] args) {
        show(123);
    }

    private static void show(int input) {
        System.out.println(input);
    }
}

class Program7 {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt);
        //wartość się nie zmienia - funkcja modifyValue zmienia wartość value w obrębie własnej pamięci
    }

    private static void modifyValue(int value) {
        System.out.println(value);
        value *= 5;
        System.out.println(value);
    }
}

class Program8 {
    public static void main(String[] args) {
        int a = 20, b = 5, c = 10;
        System.out.println(findMax(a, b, c));
    }

    private static int findMax(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }
}