import java.util.Scanner;

public class Main51 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main51Animal animal;

        Main51Cat cat = new Main51Cat();
        Main51Dog dog = new Main51Dog();

        cat.speak();
        dog.speak();

        System.out.print("1-Dog, 2-CAt: ");
        int choise = scanner.nextInt();

        if(choise == 1 ) {
            animal = new Main51Dog();
            animal.speak();
        } else if (choise == 2) {
            animal = new Main51Cat();
            animal.speak();
        }

        scanner.close();
    }
}
