public class Main45Employee extends Main45Person{
    int salary;
    Main45Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is " + this.salary);
    }
}
