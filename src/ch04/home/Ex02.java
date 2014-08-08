package ch04.home;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        final double radius = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = input.nextDouble();
        double longitude1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = input.nextDouble();
        double longitude2 = input.nextDouble();

        double x1 = Math.toRadians(latitude1);
        double x2 = Math.toRadians(latitude2);
        double y1 = Math.toRadians(longitude1);
        double y2 = Math.toRadians(longitude2);

        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + d);
    }
}
