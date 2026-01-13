public class Main49Fish implements Main49Prey, Main49Predator{
    @Override
    public void flee(){
        System.out.println("The fish is running ");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting ");
    }

}
