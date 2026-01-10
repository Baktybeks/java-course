public class Main43Friend {

    static int numOfFriends;
    String name;

    Main43Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}