package ch02.home;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = in.nextDouble();

        double meters = feet * 0.305;
        System.out.println(feet + " feet is" + meters + " meters");
    }
}
