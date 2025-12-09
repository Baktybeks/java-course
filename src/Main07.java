import java.util.Scanner;

public class Main07 {


    static void main() {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean flag;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(name.isEmpty()) {
            System.out.println("Name is empty");
        }
    }
}