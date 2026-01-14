public class Main50 {

    public static void main(String[] args) {


        Main50Car car = new Main50Car();
        Main50Bike bike = new Main50Bike();
        Main50Boat boat = new Main50Boat();

//        Main50Car[] cars = {car, bike, boat};

        Main50Vehicle[] vehicles = {car, bike, boat};

        for (Main50Vehicle vehicle: vehicles) {
            vehicle.go();
        }
    }
}
