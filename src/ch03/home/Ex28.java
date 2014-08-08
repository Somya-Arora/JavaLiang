package ch03.home;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double xc1 = input.nextDouble();
        double yc1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double xc2 = input.nextDouble();
        double yc2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double x1 = xc1 - width1 / 2;
        double y1 = yc1 - height1 / 2;
        double x2 = xc1 + width1 / 2;
        double y2 = yc1 + height1 / 2;

        double x3 = xc2 - width2 / 2;
        double y3 = yc2 - height2 / 2;
        double x4 = xc2 + width2 / 2;
        double y4 = yc2 + height2 / 2;

        if (x3 > x1 && y3 > y1 && x4 < x2 && y4 < y2) {
            System.out.println("r2 is inside r1");
        }
        else if (
                ((x1<x3 && y1<y3 && x2>x3 && y2>y3) && (y4>y2 || x4>x2)) ||
                ((x3>x1 && y4>y1 && x3<x2 && y4<y2 ) && (x4>x2 || y3<y1)) ||
                ((x4>x1 && y4>y1 && x4<x2 && y4<y2) && (x3<x1 || y3<y1)) ||
                ((x4>x1 && y3>y1 && x4<x2 && y3<y2) && (x3<x1 || y4>y2))
                ) {
            System.out.println("r2 overlaps r1");
        }
        else
            System.out.println("r2 does not overlap r1");

    }
}
