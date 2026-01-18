public class Main63 {
    public static void main(String[] args) {


        Main63Dog dog1 = new Main63Dog();
        dog1.speak();
        Main63Dog dog2 = new Main63Dog(){
            @Override
            void speak() {
                System.out.println("Woof! Woof!");
            }
        };
        dog2.speak();

        Main63TalkingDog talkingDog = new Main63TalkingDog();
        talkingDog.speak();
    }
}
