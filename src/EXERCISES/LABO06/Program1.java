package EXERCISES.LABO06;

public class Program1 {
    public static void main(String[] args) {
        int[] tab = new int[5];

        for (int i = 0; i < 5; i++)
            tab[i] = i * i;
    }
}

class Program2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a == b);

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] == b[i]);
    }
}

class Program3 {
    public static void main(String[] args) {
        int tab[] = {789, 678, 567};

        for (int i = 0; i < tab.length; i++)
            for (int j = i; j < tab.length; j++)
                System.out.println(tab[i] - tab[j]);
    }
}

class Program4 {
    public static void main(String[] args) {
        byte tab[] = new byte[10];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int index = 0;
        byte input;
        do {
            input = scanner.nextByte();
            if (input < 0)
                input = (byte) -input;
            tab[index++] = input;
        } while (input != 0 && index < tab.length);

        for (byte item : tab)
            System.out.print(item + " ");
    }
}

class Program5 {
    public static void main(String[] args) {
        byte[] foo = new byte[20];

        for (int i = 0; i < foo.length; i++)
            foo[i] = (byte) (Math.random() * 6);

        int inPar = 0, inNPar = 0;

        for (int i = 0; i < foo.length; i++) {
            if (foo[i] % 2 == 0)
                inPar++;
            else
                inNPar++;
        }

        byte[] tabPar = new byte[inPar];
        byte[] tabNPar = new byte[inNPar];

        inPar = 0;
        inNPar = 0;

        for (int i = 0; i < foo.length; i++) {
            if (foo[i] % 2 == 0) {
                tabPar[inPar] = foo[i];
                inPar++;
            } else {
                tabNPar[inNPar] = foo[i];
                inNPar++;
            }
        }

        for (byte bar : foo)
            System.out.print(bar + " ");
        System.out.println();
        for (byte bar : tabPar)
            System.out.print(bar + " ");
        System.out.println();
        for (byte bar : tabNPar)
            System.out.print(bar + " ");
        System.out.println();
    }
}

class Program6 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80, 548834};
        int licznikCyfr, pomocnicza, wynikSprawdzenia;

        for (int i = 0; i < arr.length; i++) {
            pomocnicza = arr[i];
            licznikCyfr = 1;
            while (pomocnicza > 9) {
                pomocnicza /= 10;
                licznikCyfr++;
            }

            pomocnicza = arr[i];
            wynikSprawdzenia = 0;
            while (pomocnicza != 0) {
                wynikSprawdzenia += Math.pow((pomocnicza % 10), licznikCyfr);
                pomocnicza -= (pomocnicza % 10);
                pomocnicza /= 10;
            }

            if (wynikSprawdzenia == arr[i])
                System.out.println("Liczba " + arr[i] + " to liczba Armstronga");
        }

        //(Math.pow(1,3)+Math.pow(5,3)+Math.pow(3,3)==153 ? "jest" : "nie jest");
    }
}

class Program7 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 1, 2, 3, 4};
        boolean czyDwaRazy = false;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i != j && tab[i] == tab[j]) {
                    czyDwaRazy = true;
                    break;
                }
            }
            if (!czyDwaRazy)
                break;
            if (i < tab.length - 1)
                czyDwaRazy = false;
        }
        System.out.println(czyDwaRazy);
    }
}

class Program8 {
    public static void main(String[] args) {
        byte[][] tab = new byte[5][5];
        System.out.println(tab.length);

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = (byte) (Math.random() * 126);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length / 2; j++) {
                if (tab[i][j] == tab[i][tab.length - j - 1])
                    System.out.println("Wartosc " + tab[i][j] + " wystepuje symetrycznie wzgledem pionowej osi tablicy na pozycji " + i + ", " + j);
            }
        }

        for (int i = 0; i < tab.length / 2; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i][j] == tab[tab.length - i - 1][j])
                    System.out.println("Wartosc " + tab[i][j] + " wystepuje symetrycznie wzgledem poziomej osi tablicy na pozycji " + i + ", " + j);
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[j][i] == tab[i][j])
                    System.out.println("Wartosc " + tab[i][j] + " wystepuje symetrycznie wzgledem ukosnej \\ osi tablicy na pozycji " + i + ", " + j);
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j + i < tab.length - 1; j++) {
                if (tab[i][j] == tab[tab.length - 1 - j][tab.length - 1 - i])
                    System.out.println("Wartosc " + tab[i][j] + " wystepuje symetrycznie wzgledem ukosnej / osi tablicy na pozycji " + i + ", " + j);
            }
        }

    }
}