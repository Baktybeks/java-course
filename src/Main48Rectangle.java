public class Main48Rectangle extends Main48Shape{

    double  length, width;


    Main48Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
