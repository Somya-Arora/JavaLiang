package ch02.home;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x1, x2, y1, y2;

        System.out.print("Enter x1 and y1: ");

        x1 = in.nextDouble();
        y1 = in.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        double length = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
        System.out.println("The distance between the two points is " + length);
    }
}
