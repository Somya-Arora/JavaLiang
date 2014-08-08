package ch03.home;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();

        // x+2y-200 = 0

        if (((x + 2 * y - 200) < 0) && x > 0 && y > 0) {
            System.out.println("The point is in the triangle");
        } else
            System.out.println("The point is not in the triangle");
    }
}
