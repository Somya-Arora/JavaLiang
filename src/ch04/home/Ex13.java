package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex13 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        char ch = input.next().charAt(0);

        if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        }
        else {
            System.out.println(ch+ " is an invalid input\n");
        }
    }
}
