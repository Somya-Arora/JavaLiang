package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e10_FutureTuition {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        double tuition = 10000; // Year 0
        int year = 0;

        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);


    }
}
