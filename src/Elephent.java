public class Elephent extends Animol{

    public Elephent(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("Тру-у-у, я слон!, " + super.getName());
    }
}
