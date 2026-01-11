public class Main45Student extends Main45Person {
    double gpa;

    Main45Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}
