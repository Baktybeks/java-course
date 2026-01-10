public class Main41 {
    public static void main(String[] args) {

        Main41User user = new Main41User();
        Main41User user1 = new Main41User("Bakyt");
        Main41User user2 = new Main41User("Bakyt", "admin@mail.ru");
        Main41User user3 = new Main41User("Bakyt", "admin@mail.ru", 40);

        System.out.println(user.username);
        System.out.println(user.email);
        System.out.println(user.age);
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
