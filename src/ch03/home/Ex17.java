package ch03.home;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int comp = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int human = input.nextInt();

        System.out.print("The computer is ");

        switch (comp) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");
                break;
        }

        System.out.print(" You are ");
        switch (human) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
        }

        if ((human > comp) || (human == 0 && comp == 2)) {
            System.out.print(". You won.");
        }
        else if (human == comp)
            System.out.print(" too. It is a draw.");
        else
            System.out.print(". You lose.");

    }
}
