public class Main48Circle extends Main48Shape{

    double radius;

    Main48Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
