public class Main26 {
    public static void main(String[] args){

        // method =  a block of reusable code that is executed when called ()

        String  name =  "Spongebob";
        int age = 30;

        happyBirthday(name, age);
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
}