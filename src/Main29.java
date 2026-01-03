import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        //Java  banking  program for beginners
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //display   menu

        //get and   process users  choice

        while (isRunning) {
            System.out.println("****************");
            System.out.println("BANKING  PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show  balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        //showBalance()


        //  deposit()

        //withdraw()

        //exit  message

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }
    static double  deposit

}
