package ch03.home;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (dist < 10) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        }
        else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
}
