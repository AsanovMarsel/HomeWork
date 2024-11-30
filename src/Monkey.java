public class Monkey extends Animol{
    public Monkey(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("У-у-у, я обезьяна!, " + super.getName());
    }
}
