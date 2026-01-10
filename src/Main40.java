public class Main40 {
    public static void main(String[] args) {

        // constructor = A special method to initialize objects
        //                         You can pass arguments to a constructor
        //                         and set up initial values

        Main40Student student1 = new Main40Student("Spongebob", 30, 3.2);
        Main40Student student2 = new Main40Student("Patrick", 34, 1.5);
        Main40Student student3 = new Main40Student("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}