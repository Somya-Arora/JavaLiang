package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String str = input.next();
        char ch = str.charAt(0);

        System.out.println("The Unicode for the character " + ch + " is " + (int) ch);

    }
}
