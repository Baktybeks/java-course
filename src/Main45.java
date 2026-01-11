public class Main45 {
    public static void main(String[] args) {
        Main45Person person = new Main45Person("Baktybek","Sariev");
        Main45Student student = new Main45Student("Harry", "Potter", 4);
        Main45Employee employee = new Main45Employee("Harry", "Potter", 123124);
        person.showName();
        student.showName();
        student.showGPA();
        employee.showName();
        employee.showSalary();
    }
}

