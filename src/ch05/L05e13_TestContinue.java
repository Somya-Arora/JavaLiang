package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e13_TestContinue {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);

    }
}
