//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
Book book = new Book("Hary Potter", "Elzar", 1000);
        System.out.println(book);
        EBook eBook = new EBook(100000,"Hary Potter", "Elzar",1000);
        System.out.println(eBook);

        //2
        Lion lev = new Lion("lev");
        Elephent slon = new Elephent("slon");
        Monkey obezyana = new Monkey("obezyana");

        lev.makeSound();
        slon.makeSound();
        obezyana.makeSound();
    }
}