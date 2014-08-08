package ch03.home;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        System.out.print("What is " + a + " + " + b + " + " + c + "? ");
        int answer = input.nextInt();
        System.out.println(a + " + " + b + " + " + c + " = " + answer + " is " + (a + b + c == answer));
    }
}
