package EXERCISES.LABO03;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(2 + 3);
        System.out.println(2.0 + 3);
        System.out.println(2 + 3.0);
        System.out.println(2.0 + 3.0);

        System.out.println(2 - 3);
        System.out.println(2.0 - 3);
        System.out.println(2 - 3.0);
        System.out.println(2.0 - 3.0);

        System.out.println(2 * 3);
        System.out.println(2.0 * 3);
        System.out.println(2 * 3.0);
        System.out.println(2.0 * 3.0);

        System.out.println(2 / 3);
        System.out.println(2.0 / 3);
        System.out.println(2 / 3.0);
        System.out.println(2.0 / 3.0);

        System.out.println(2 % 3);
        System.out.println(2.0 % 3);
        System.out.println(2 % 3.0);
        System.out.println(2.0 % 3.0);


        System.out.println('A' + 'B');
        System.out.println('A' - 'B');
        System.out.println('A' * 'B');
        System.out.println('A' / 'B');
        System.out.println('A' % 'B');
    }
}

class Program2 {
    public static void main(String[] args) {
        char charValue = 'A';
        char charvalue = 'y';
		/*
		Program się skompiluje. Java rozróżnia wielkość znaków
		więc są to dwie różne zmienne
		*/
        System.out.println(charValue - charvalue);
    }
}

class Program3 {
    public static void main(String[] args) {
        boolean boolean1 = true;
        boolean boolean2 = true;
        boolean wynik;

        wynik = (boolean1 && !boolean2) || (boolean2 && !boolean1);
        System.out.println(wynik);


        boolean2 = false;
        wynik = (boolean1 && !boolean2) || (boolean2 && !boolean1);
        System.out.println(wynik);

        boolean1 = false;
        wynik = (boolean1 && !boolean2) || (boolean2 && !boolean1);
        System.out.println(wynik);

        boolean2 = true;
        wynik = (boolean1 && !boolean2) || (boolean2 && !boolean1);
        System.out.println(wynik);
    }
}

class Program4 {
    public static void main(String[] args) {
        int s = 0x25692;
        System.out.println(s);
        System.out.println(0b0010_0101_0110_1001_0010);
    }
}

class Program5 {
    public static void main(String[] args) {
        System.out.println(13 % 2);
        System.out.println(13 % 3);
        System.out.println();
        System.out.println(15 % 2);
        System.out.println(15 % 3);
        System.out.println();
        System.out.println(17 % 2);
        System.out.println(17 % 3);
    }
}

class Program6 {
    public static void main(String[] args) {
        int x = 2 * 5 + 3 * 4 - 8;

        System.out.println(x);

        x = 2 * ((5 + 3) * 4 - 8);
        System.out.println(x);

    }
}

class Program7 {
    public static void main(String[] args) {
        System.out.println(0b00000 + " 00000");
        System.out.println(0b00001 + " 00001");
        System.out.println(0b00011 + " 00011");
        System.out.println(0b00010 + " 00010");
        System.out.println(0b00110 + " 00110");
        System.out.println(0b00111 + " 00111");
        System.out.println(0b00101 + " 00101");
        System.out.println(0b00100 + " 00100");
        System.out.println(0b01100 + " 01100");
        System.out.println(0b01101 + " 01101");
        System.out.println(0b01111 + " 01111");
        System.out.println(0b01110 + " 01110");
        System.out.println(0b01010 + " 01010");
        System.out.println(0b01011 + " 01011");
        System.out.println(0b01001 + " 01001");
        System.out.println(0b01000 + " 01000");
        System.out.println(0b11000 + " 11000");
        System.out.println(0b11001 + " 11001");
        System.out.println(0b11011 + " 11011");
        System.out.println(0b11010 + " 11010");
        System.out.println(0b11110 + " 11110");
        System.out.println(0b11111 + " 11111");
        System.out.println(0b11101 + " 11101");
        System.out.println(0b11100 + " 11100");
        System.out.println(0b10100 + " 10100");
        System.out.println(0b10101 + " 10101");
        System.out.println(0b10111 + " 10111");
        System.out.println(0b10110 + " 10110");
        System.out.println(0b10010 + " 10010");
        System.out.println(0b10011 + " 10011");
        System.out.println(0b10001 + " 10001");
        System.out.println(0b10000 + " 10000");
    }
}