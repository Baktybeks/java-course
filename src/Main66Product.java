public class Main66Product<T, U> {
    private final T name;
    private final U price;

    Main66Product(T name, U price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }
    public U getPrice() {
        return price;
    }
}
