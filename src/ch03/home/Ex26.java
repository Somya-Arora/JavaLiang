package ch03.home;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int a = input.nextInt();


        boolean quest1 = (a % 5 == 0 && a % 6 == 0) ? true : false;
        boolean quest2 = (a % 5 == 0 || a % 6 == 0) ? true : false;
        boolean quest3 = (a % 5 == 0 ^ a % 6 == 0) ? true : false;

        System.out.println("Is " + a + " divisible by 5 and 6? " + quest1);
        System.out.println("Is " + a + " divisible by 5 or 6? " + quest2);
        System.out.println("Is " + a + " divisible by 5 or 6, but not both? " + quest3);
    }
}
