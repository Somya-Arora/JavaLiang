package ch03.home;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 lenghts of triangle: ");

        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if ((((a + b) > c) && ((a + c) > b) && ((b + c) > a)) && (a != 0 && b != 0 && c != 0)) {
            System.out.println("The perimetr is " + (a + b + c));
        }
        else {
            System.out.println("The inpur is invalid");
        }
    }
}
