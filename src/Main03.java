import java.util.Scanner;
public class Main03 {
    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.println("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is: " + gpa);
//
//        if(isStudent){
//            System.out.println("You are enrolled in classes");
//        }
//        else{
//            System.out.println("You are NOT enrolled in classes");
//        }
//
//        scanner.close();
        double  width =  0;
        double height  = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width");
        width = scanner.nextDouble();
        System.out.print("Enter height");
        height = scanner.nextDouble();

        System.out.println(width*height + "cm");

        scanner.close();
    }
}
