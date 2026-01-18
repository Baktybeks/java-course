import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Main71AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private  final String filePath;
    private final Scanner scanner;

    Main71AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
//        System.out.println("Current time: " + LocalTime.now());



        while (LocalTime.now().isBefore(alarmTime)) {
            LocalTime now = LocalTime.now();
            try {
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                System.out.println("Alarm clock interrupted.");
            }
        }

        System.out.println("\nAlarm ringing! Time to wake up!");
        playAlarmSound(filePath);
    }

    private void playAlarmSound(String filePath) {
        File audioFile = new File(filePath);
        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press ENTER to stop the alarm.");
            scanner.nextLine();
            clip.stop();
            scanner.close();
//            Thread.sleep(5000);


        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file.");
        } catch(LineUnavailableException e) {
            System.out.println("Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("Error playing the audio file.");
        }
//        catch (InterruptedException e) {
//
//            System.out.println("Alarm sound interrupted.");
//        }
    }
}
