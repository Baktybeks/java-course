public class Main54 {
    public static void main(String[] args) {
        Main54Car car = new Main54Car("Toyota Camry", 2020, "V6");
        System.out.println("Car Model: " + car.model);
        System.out.println("Car Year: " + car.year);
        System.out.println("Engine Type: " + car.engine.type);

        car.start();
    }
}
