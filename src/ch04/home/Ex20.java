package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex20 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Length of string = " + str.length() + ", first character is " + str.charAt(0));
    }
}
