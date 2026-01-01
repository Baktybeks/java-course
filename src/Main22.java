import java.util.Random;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemts = 0;
        int min =1;
        int max = 100;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attemts++;
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        } while (guess != randomNumber);

        System.out.println("You have won");
        System.out.println("You won in " + attemts + " attempts!");
    }
}
