package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.println("The character for ASCII code " + code + " is " + (char) code);
    }
}
