package ch03.home;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (c < a) {
            int tmp = a;
            a = c;
            c = tmp;
        }

        if (c < b) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
