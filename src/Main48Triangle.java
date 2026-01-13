public class Main48Triangle extends Main48Shape{

    double  base;
    double  height;

    Main48Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 *  this.base * this.height;
    }
}
