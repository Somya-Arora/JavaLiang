package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");


        int val = input.nextInt();



        if (val >= 0 && val < 10) {
            System.out.println("The hex value is " + val);
        }
        else if (val > 15 || val < 0) {
            System.out.println(val + " is an invalid input");
        }
        else {
            char ch = 'A';
            System.out.println("The hex value is " + (char)(ch + val - 10));
        }


    }
}
