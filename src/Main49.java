public class Main49 {
    public static void main(String[] args) {


        Main49Rabbit rabbit = new Main49Rabbit();
        Main49Hawk hawk = new Main49Hawk();
        Main49Fish fish = new Main49Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
    }
}
