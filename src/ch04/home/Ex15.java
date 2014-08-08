package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex15 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if ((letter < 'A' && letter > 'Z') || (letter < 'a' && letter > 'z')) {
            System.out.println(letter + "+ is an invalid input");
        }
        else {
            System.out.print("The corresponding number is ");
            letter = Character.toUpperCase(letter);
            switch ((int) letter) {
                case 65:
                case 66:
                case 67:
                    System.out.print(" 2");
                    break;
                case 68:
                case 69:
                case 70:
                    System.out.print(" 3");
                    break;
                case 71:
                case 72:
                case 73:
                    System.out.print(" 4");
                    break;
                case 74:
                case 75:
                case 76:
                    System.out.print(" 5");
                    break;
                case 77:
                case 78:
                case 79:
                    System.out.print(" 6");
                    break;
                case 80:
                case 81:
                case 82:
                case 83:
                    System.out.print(" 7");
                    break;
                case 84:
                case 85:
                case 86:
                    System.out.print(" 8");
                    break;
                case 87:
                case 88:
                case 89:
                case 90:
                    System.out.print(" 2");
                    break;
            }
        }
    }
}
