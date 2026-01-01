import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {

        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row");
        rows = scanner.nextInt();
        System.out.print("Enter columns");
        columns = scanner.nextInt();

        System.out.print("Enter char");
        symbol = scanner.next().charAt(0);


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}

