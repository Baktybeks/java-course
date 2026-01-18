import java.util.Scanner;

public class Main68 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day of the week (e.g., MONDAY): ");
            String response = scanner.nextLine().toUpperCase();
            Main68Day day = Main68Day.valueOf(response);
            System.out.println("Day: " + day);
            System.out.println("Day Number: " + day.getDayNumber());

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday.");
                case SATURDAY, SUNDAY, PIZZADAY -> System.out.println("It's the weekend!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }
    }
}
