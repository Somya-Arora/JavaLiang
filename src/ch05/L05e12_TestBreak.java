package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e12_TestBreak {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);


    }
}
