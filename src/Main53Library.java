public class Main53Library {
    String name;
    int year;
    Main53Book[] books;

    Main53Library(String name, int year, Main53Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void  displayInfo() {
        System.out.println("Library: " + this.name + ", Established: " + this.year);
        System.out.println("Books available:");
        for (Main53Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
