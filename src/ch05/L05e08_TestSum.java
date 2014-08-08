package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e08_TestSum {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        float sum = 0;

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        // Display result
        System.out.println("The sum is " + sum);

    }
}
