import java.util.Scanner;

public class Main32 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] foods = {};
//        String[] foods = new String[3];
//        foods[0]= "apple";
//        foods[1]= "onion";
//        foods[2]= "taco";
//
//        for(int i = 0; i< foods.length; i++){
//            System.out.print("Enter the food: ");
//            foods[i] = scanner.nextLine();
//
//        }
//
//        System.out.println(foods.length);
//        for(String food : foods) {
//            System.out.print(food + " ");
//        }
//        scanner.close();

        String[] foods;
        int size;

        System.out.print("How many foods do you want?");

        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i<foods.length; i++) {
            System.out.print("Enter the food name: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.print(food + " ");
        }
    }
}
