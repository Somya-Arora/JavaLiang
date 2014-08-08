package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex21 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        if (ssn.length() != 11) {
            System.out.println(ssn + " is an invalid social security number");
        } else {
            if (
                    ssn.charAt(3) != '-' ||
                    ssn.charAt(6) != '-' ||
                    (ssn.charAt(0) < '0' || ssn.charAt(0) > '9') ||
                    (ssn.charAt(1) < '0' || ssn.charAt(1) > '9') ||
                    (ssn.charAt(2) < '0' || ssn.charAt(2) > '9') ||
                    (ssn.charAt(4) < '0' || ssn.charAt(4) > '9') ||
                    (ssn.charAt(5) < '0' || ssn.charAt(5) > '9') ||
                    (ssn.charAt(7) < '0' || ssn.charAt(7) > '9') ||
                    (ssn.charAt(8) < '0' || ssn.charAt(8) > '9') ||
                    (ssn.charAt(9) < '0' || ssn.charAt(9) > '9') ||
                    (ssn.charAt(10) < '0' || ssn.charAt(10) > '9')
                    ) {
                System.out.println(ssn + " is an invalid social security number");
            } else
                System.out.println(ssn + " is a valid social security number");
        }

    }
}
