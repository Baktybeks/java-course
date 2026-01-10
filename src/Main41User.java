public class Main41User {
    String username;
    String email;
    int age;

    Main41User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    Main41User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    Main41User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    Main41User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
