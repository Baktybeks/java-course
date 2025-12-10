import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Operator: ");
        operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        System.out.println(result);
        sc.close();
    }
}
