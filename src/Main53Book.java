public class Main53Book {

    String title;
    int  pages;

    Main53Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String  displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }
}
