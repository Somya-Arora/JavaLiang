package ch03;

import java.util.Scanner;

public class L03e01_AdditionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int answer = in.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
