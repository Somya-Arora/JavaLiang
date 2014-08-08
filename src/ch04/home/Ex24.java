package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex24 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        char ch1 = city1.charAt(0);
        char ch2 = city2.charAt(0);
        char ch3 = city3.charAt(0);

        if (ch2 < ch1) {
            String tmp = city2;
            city2 = city1;
            city1 = tmp;
        }

        if (ch3 < ch1) {
            String tmp = city3;
            city3 = city1;
            city1 = tmp;
        }

        if (ch3 < ch2) {
            String tmp = city3;
            city3 = city2;
            city2 = tmp;
        }

        System.out.println("The three cities in alphabetical order are: " + city1 + " " + city2 + " " + city3);
    }
}
