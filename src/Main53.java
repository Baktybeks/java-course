public class Main53 {
    public static void main(String[] args) {
        Main53Book[] books = {
                new Main53Book("Java Programming", 450),
                new Main53Book("Python Programming", 380),
                new Main53Book("Java Programming2", 450)
        };

//        for (Main53Book book : books) {
//            System.out.println(book.displayInfo());
//        }

        Main53Library  library  =  new  Main53Library("City Library", 1995, books);
        library.displayInfo();
    }
}