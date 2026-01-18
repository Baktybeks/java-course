public class Main70 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Main70MyRunnable("PING"));
        Thread thread2 = new Thread(new Main70MyRunnable("PONG"));

        System.out.println("GAME START");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("GAME OVER");
    }
}
