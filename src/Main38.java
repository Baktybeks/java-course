import java.util.Random;
import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;
        System.out.println("******************************");
        System.out.println(" Welcome to the main program! ");
        System.out.println("Symbols:  🍉  🍋  🍒  🔔  ⭐ ");
        System.out.println("******************************");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter  your  bet:");
            bet = scanner.nextInt();  //очистка
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("Insufficient balance!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be a positive number!");
            } else {
                balance -= bet;
                System.out.println("Your balance: " + balance);
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("Your payout: " + payout);
                balance += payout;
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Game over! Your balance: " + balance);
        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍉", "🍋", "🍒", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();
        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
//        System.out.println(row[0] + row[1] + row[2]);
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
