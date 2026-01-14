public class Main50I {

    public static void main(String[] args) {


        Main50CarI car = new Main50CarI();
        Main50BikeI bike = new Main50BikeI();
        Main50BoatI boat = new Main50BoatI();

//        Main50Car[] cars = {car, bike, boat};

        Main50VehicleI[] vehicles = {car, bike, boat};

        for (Main50VehicleI vehicle: vehicles) {
            vehicle.go();
        }
    }
}
