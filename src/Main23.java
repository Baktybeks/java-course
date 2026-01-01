import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) throws InterruptedException{

        int timer = 10;

        for (int i = timer; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year");
    }
}
