import java.util.Scanner;

public class Main69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main69MyRunnable myRunnable = new Main69MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("You have 10 seconds to enter your name");

        System.out.print("Press Enter after typing your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();

    }
}