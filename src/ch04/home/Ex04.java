package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f\n", area);
    }
}
