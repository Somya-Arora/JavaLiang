package ch03.home;


public class Ex24 {
    public static void main(String[] args) {
        int rank = 1 + (int) (Math.random() * 13);

        int suit = 1 + (int) (Math.random() * 4);


        System.out.print("The card you picked is ");
        if (rank == 1)
            System.out.print("Ace");
        else if (rank == 11)
            System.out.print("Jack");
        else if (rank == 12)
            System.out.print("Queen");
        else if (rank == 13)
            System.out.print("King");
        else
            System.out.print(rank);

        System.out.print(" of ");

        switch (suit) {
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
                break;
        }
    }
}
