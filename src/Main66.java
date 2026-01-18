import java.util.ArrayList;

public class Main66 {
    public static void main(String[] args) {

// Generics = A concept where you can write a class, interface, or method
//                     that is compatible with different data types.
//                    <T> type parameter (placeholder that gets replaced with a real type)
//                    <String> type argument (specifies the type)
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//
//        System.out.println(fruits);
        Main66Box<String> box = new Main66Box<>();
        box.setItem("Hello Generics");
        System.out.println(box.getItem());

        Main66Box<Integer> box2 = new Main66Box<>();
        box2.setItem(789);
        System.out.println(box2.getItem());

        Main66Product<String, Double> product = new Main66Product<>("Laptop", 999.99);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
