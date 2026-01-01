public class Main27 {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                                          but different parameters
        //                                          signature = name + parameters

        String pizza = bakePizza("flat-bread", "mozzarella", "pepperoni");

        System.out.println(pizza);

        System.out.println(add(1,2,3));

    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b,   double c) {
        return a + b + c;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}