import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main71 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime  =  null;
        String filePath = "src\\Broken-Promise-Jimena-Contreras.wav";

        while (alarmTime == null) {
            System.out.print("Set the alarm time (HH:mm:ss): ");
            String inputTime = scanner.nextLine();
            try {
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime.format(formatter));

            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please use HH:mm:ss.");
            }
        }

        Main71AlarmClock alarmClock = new Main71AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

//        scanner.close();
    }
}
