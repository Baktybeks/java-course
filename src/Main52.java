public class Main52 {
    public static void main(String[] args) {

        Main52Car car = new Main52Car("BMW", "red", 100000);

//        System.out.println(car.model + " " + car.color + " " +car.price);

        car.setColor("Green");
        car.setPrice(-1500000);

        System.out.println(car.getModel() + " " + car.getColor() + " " +car.getPrice());

    }
}
