public class Main48 {
    public static void main(String[] args) {
//        Main48Shape shape = new Main48Shape() НЕЛЬЗЯ СОЗДАТЬ
        Main48Circle circle = new Main48Circle(3);
        Main48Rectangle rectangle = new Main48Rectangle(6,7);
        Main48Triangle triangle = new Main48Triangle(4,5);

        circle.display();
        rectangle.display();
        triangle.display();

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
