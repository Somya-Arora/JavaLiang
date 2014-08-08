package ch04.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex18 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String in = input.next();
        char ch1 = in.charAt(0);
        char ch2 = in.charAt(1);

        if ((ch1 != 'M' && ch1 != 'C' && ch1 != 'I') || (ch2 > 4 && ch2 < 1)) {
            System.out.print("Invalid input");
        }
        else {

            String str1="";
            String str2="";

            if (ch1 == 'M')
                str1 = "Mathematics";
            else if (ch1 == 'C')
                str1 = "Computer Science";
            else
                str1 = "Information Technology";

            if (ch2 == '1')
                str2 = "Freshman";
            else if (ch2 == '2')
                str2 = "Sophomore";
            else if (ch2 == '3')
                str2 = "Junior";
            else
                str2 = "Senior";

            System.out.println(str1 + " " + str2);
        }
    }
}
