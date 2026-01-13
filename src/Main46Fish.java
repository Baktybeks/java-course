public class Main46Fish extends Main46Animal {


    @Override //аннотация чтобы знать что идет переопределение метода
    void move(){
        System.out.println("This animal is swimming");
    }
}
