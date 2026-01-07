import java.util.Random;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {

        //Java dice roller program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //declare variables

        int numOfDice;
        int total = 0;

        //get of dice from the user

        System.out.print("Enter the number of dice: ");
        numOfDice = scanner.nextInt();

        //check if  # of dice > 0
        if (numOfDice > 0) {
            for (int i = 1; i <= numOfDice; i++) {
                int  roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                //get the total
                total += roll;
            }
            System.out.println("Total: " + total);

        }  else  {
            System.out.println("#  of dice must be positive");
        }



        //display ASCII od dice



        scanner.close();
    }

    static void printDie (int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
