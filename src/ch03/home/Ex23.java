package ch03.home;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ((x>-10/2)&&(x<10/2) && (y>-5.0/2)&&(y<5.0/2))
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}
