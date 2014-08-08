package ch03.home;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double d = Math.pow(b * b - 4 * a * c, 0.5);

        if (d > 0) {
            double r1 = (-b + d) / 2 * a;
            double r2 = (-b - d) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (d == 0) {
            double r = -b / 2 * a;
            System.out.println("The equation has one root " + r);
        }
        else
            System.out.println("The equation has no real roots");
    }
}
