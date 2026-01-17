import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {
//        ArrayList<Double> list = new ArrayList<>();
//        ArrayList<String> fruits = new ArrayList<>();
//
//        list.add(1.0);
//        list.add(2.0);
//        list.add(3.0);
//
//        fruits.add("cherry");
//        fruits.add("banana");
//        fruits.add("apple");

//        fruit.remove(1);
//        fruit.set(0, "mango");

//        System.out.println(list);
//        System.out.println(fruits);
//        System.out.println(fruits.get(1));
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
        Scanner scanner=new Scanner(System.in);

        ArrayList<String> list = new ArrayList();

        System.out.print("Enter the # of items: ");
        int numberOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfFood; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = scanner.nextLine();
            list.add(item);
        }
        System.out.println("You have entered: " + list);


        scanner.close();
    }
}
