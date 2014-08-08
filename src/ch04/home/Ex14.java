package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char ch = input.next().charAt(0);

        if (ch > 'E' && ch < 'A') {
            System.out.println(ch + " is an invalid grade");
        }
        else {
            int i = 69 - (int) ch;
            System.out.println("The numeric value for grade " + ch + " is " + i);
        }
    }
}
