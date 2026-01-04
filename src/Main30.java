import java.util.Random;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {

        //Java dice roller program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //declare variables

        int numOfDice;
        int total;

        //get of dice from the user

        System.out.print("Enter the number of dice: ");
        numOfDice = scanner.nextInt();

        //check if  # of dice > 0
        if (numOfDice > 0) {
            for (int i = 1; i <= numOfDice; i++) {
                int  roll = random.nextInt(6) + 1;
            }

        }  else  {
            System.out.println("#  of dice must be positive");
        }

        //get the total

        //display ASCII od dice

        scanner.close();
    }
}
