package ch03.home;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Heads or tails? Enter 0 or 1: ");

        int guess = input.nextInt();
        int flip = (int)(Math.random()*2);

        if (guess == flip) {
            System.out.println(flip+ " You win");
        }
        else
            System.out.println(flip + " You lose");
    }
}
