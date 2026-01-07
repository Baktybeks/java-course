import java.util.Scanner;

public class Main33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int target = 30;
        boolean isFound = false;
        String target_fruit;
        String[] fruits = {"apple", "banana", "orange"};
//        String target_fruit = "banana1";
        target_fruit = scanner.nextLine();


//        for(int i=0; i< numbers.length; i++){
//            if(target == numbers[i]) {
//                System.out.println("This index is:"+i);
//                isFound = true;
//                break;
//            }
//        }

//        for (int i = 0; i < fruits.length; i++) {
//            if (fruits[i].equals(target_fruit)) {
//                System.out.println("This index is:" + i);
//                isFound = true;
//                break;
//            }
//        }
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target_fruit)) {
                System.out.println("This index is:" + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
        scanner.close();
    }
}
