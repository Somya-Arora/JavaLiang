package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex22 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        boolean contain = (s1.contains(s2)) ? true : false;

        if (contain) {
            System.out.println(s2 + " is a substring of " + s1);
        }
        else
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
