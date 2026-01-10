public class Main42 {
    public static void main(String[] args) {
//        Main42Car car1 = new Main42Car("Ford", "red");
//        Main42Car car2 = new Main42Car("BMW", "blue");
//        Main42Car car3 = new Main42Car("Mers", "black");

//        car1.drive();
//        car2.drive();
//        car3.drive();

//        Main42Car[] cars = {car1, car2, car2};
        //анонимные объекты без присвоения имен
        Main42Car[] cars = {
                new Main42Car("Ford", "red"),
                new Main42Car("BMW", "blue"),
                new Main42Car("Mers", "black")
        };

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        for (Main42Car car : cars) {
            car.color = "black";
        }
        for (Main42Car car : cars) {
            car.drive();
        }
    }
}
