public class Main54Car {
    String model;
    int year;
    Main54Engine engine;

    Main54Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Main54Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("Car " + this.model + " started.");
    }
}
