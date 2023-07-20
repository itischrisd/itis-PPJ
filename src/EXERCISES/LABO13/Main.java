package EXERCISES.LABO13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // zad1
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int helper = input;
        String output = "";

        for (int i = 0; i < 32; i++) {
            output = (helper & 1) + output;
            helper = helper >> 1;
        }
        System.out.println("bin \t" + output);

        helper = input;
        output = "";
        for (int i = 0; i < 16; i++) {
            output = ((helper >> i * 2) & 0b11) + output;
        }
        System.out.println("quad \t" + output);

        output = "";
        for (int i = 0; i < 8; i++) {
            output = ((helper >> i * 3) & 0b111) + output;
        }
        System.out.println("oct \t" + output);

        output = "";
        int hexChar;
        for (int i = 0; i < 4; i++) {
            hexChar = ((helper >> i * 4) & 0b1111);
            helper = helper >> i * 4;
            if (hexChar < 10)
                output = hexChar + output;
            else if (hexChar == 10)
                output = "A" + output;
            else if (hexChar == 11)
                output = "B" + output;
            else if (hexChar == 12)
                output = "C" + output;
            else if (hexChar == 13)
                output = "D" + output;
            else if (hexChar == 14)
                output = "E" + output;
            else if (hexChar == 15)
                output = "F" + output;
        }
        System.out.println("hex \t" + output);

        // zad2
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/EXERCISES/LABO13/input.txt");
            int res = 0;
            res = (res << 8) | fileInputStream.read();
            res = (res << 8) | fileInputStream.read();
            res = (res << 8) | fileInputStream.read();
            res = (res << 8) | fileInputStream.read();
            System.out.println(res);
            System.out.println(0b1110000000000000000001001000101);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zad3
        String regex = "[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.";

        // zad4
        String regex2 = "\\d{4}-\\d{1,2}-\\d{1,2}";
    }
}
