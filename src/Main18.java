
public class Main18 {

    public static void main(String[] args) {
        String day = "M";

        switch (day) {
            case "M" -> System.out.println("Monday");
            case "T" -> System.out.println("Tuesday");
            case "W" -> System.out.println("Wednesday");
            case "X" -> System.out.println("Thursday");
            case "Y" -> System.out.println("Friday");
            case "S" -> System.out.println("Saturday");
            case "D" -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
