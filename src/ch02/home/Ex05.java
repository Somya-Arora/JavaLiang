package ch02.home;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextDouble();
        double rate = in.nextDouble();

        double gratuity = subtotal * rate / 100.0;
        double total = gratuity + subtotal;


        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
