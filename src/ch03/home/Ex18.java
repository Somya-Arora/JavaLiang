package ch03.home;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of package: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 1) {
            System.out.print("Shipping cost is ");
            System.out.println("$3.5");
        } else if (weight > 1 && weight <= 3) {
            System.out.print("Shipping cost is ");
            System.out.println("$5.5");
        } else if (weight > 3 && weight <= 10) {
            System.out.print("Shipping cost is ");
            System.out.println("$8.5");
        } else if (weight > 10 && weight <= 50) {
            System.out.print("Shipping cost is ");
            System.out.println("$10.5");
        } else {
            System.out.println("The package cannot be shipped.");
        }


    }
}
