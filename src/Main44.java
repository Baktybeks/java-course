public class Main44 {
    public static void main(String[] args) {
        Main44Dog dog = new Main44Dog();
        Main44Cat cat = new Main44Cat();
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        dog.eat();
        cat.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        Main44Plant plant = new Main44Plant();

        System.out.println(plant.isAlive);
        plant.photosynthesis();

    }
}
