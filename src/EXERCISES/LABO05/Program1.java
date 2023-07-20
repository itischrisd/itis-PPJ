package EXERCISES.LABO05;

public class Program1 {
    public static void main(String[] args) {
        for (int i = 75; i <= 150; i++) {
            System.out.print("Znak ");
            System.out.print((char) i);
            System.out.print(" reprezentuje ");
            System.out.println(i);
        }
    }
}

class Program2 {
    public static void main(String[] args) {
        byte b = (byte) (Math.random() * 15);
        char hex;
        if (b < 10)
            hex = (char) (b + '0');
        else
            hex = (char) (b - 10 + 'A');
        System.out.println(b + " -> " + hex);
    }
}

class Program3 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        System.out.println("i: i\ti^2\ti^3\ti^4");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 1, pom = 1; j <= 4; j++) {
                pom = pom * i;
                System.out.print(pom + "\t");
            }
            System.out.println();
        }
        // n = 5
        // i: i  i^2 i^3  i^4
        // 1: 1	 1	 1	  1
        // 2: 2  4   8    16
        // 3: 3  9   27   81
        // 4: 4  16  64   128
        // 5: 5  25  125  625
    }
}

class Program4 {
    public static void main(String[] args) {
        int height = 40, width = 80;
        char star = '*', space = ' ';
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if ((h + w) % 2 == 0)
                    System.out.print(star);
                else
                    System.out.print(space);
            }
            System.out.println();
        }
    }
}

class Program5 {
    public static void main(String[] args) {
        double[] foo = new double[10];

        for (int i = 0; i < foo.length; i++) {
            foo[i] = Math.random() * 20;
        }

        for (double bar : foo)
            System.out.println(bar + "  ");

        System.out.println();

        for (int i = 0; i < foo.length; i++) {
            if (i % 2 == 0)
                System.out.println(foo[i]);
        }

        System.out.println();

        for (double bar : foo) {
            if ((int) (bar) % 2 == 1) {
                int barToInt = (int) (bar);
                System.out.println(bar + "\t" + barToInt);
            }
        }
    }
}

class Program6 {
    public static void main(String[] args) {
        char[] foo = new char[3];
        for (int i = 0; i < foo.length; i++) {
            foo[i] = (char) (33 + Math.random() * 93);
            System.out.print(foo[i] + " ");
        }


        if (foo[0] > foo[1])
            if (foo[1] > foo[2])
                System.out.println("Najmniejszy jest " + foo[2]);
            else
                System.out.println("Najmniejszy jest " + foo[1]);
        else if (foo[0] > foo[2])
            System.out.println("Najmniejszy jest " + foo[2]);
        else System.out.println("Najmniejszy jest " + foo[0]);
    }
}