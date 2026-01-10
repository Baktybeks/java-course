public class Main43 {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Main43Friend friend1 = new Main43Friend("Spongebob");
        Main43Friend friend2 = new Main43Friend("Patrick");
        Main43Friend friend3 = new Main43Friend("Squidward");
        Main43Friend friend4 = new Main43Friend("Sandy");

        Main43Friend.showFriends();
    }
}