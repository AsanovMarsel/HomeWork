public class Animol {
        private String name;

        public Animol(String name){
            this.name = name;
        }

        public void makeSound (){
            System.out.println(this.name);
        }

        public String getName (){
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
    }


