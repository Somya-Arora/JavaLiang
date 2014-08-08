package ch03.home;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double znam = a * d - b * c;

        if (znam != 0) {
            double x = (e * d - b * f) / znam;
            double y = (a * f - e * c) / znam;
            System.out.println("x is " + x + " and y is " + y);
        }
        else
            System.out.println("The equation has no solution");
    }
}
