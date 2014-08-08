package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex12 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        char ch = input.next().charAt(0);

//        String ch = input.next();

        System.out.println("The binary value is " + Character.forDigit((int) ch, 2));
    }
}
