package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (n * side * side) / (4.0 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon is " + area);
    }
}
