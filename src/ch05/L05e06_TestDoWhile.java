package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e06_TestDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        int data;
        int sum = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);

    }
}
