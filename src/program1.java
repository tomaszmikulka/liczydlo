public class program1 {
    public static void main(String[] args) {

        Car auto1 = new Car(4,5,6,"czerwony");
        Car auto2 = new Car(4,4,2,"niebieski");
        Rabbit krolik1 = new Rabbit(50,"Hanek",true);
        krolik1.changeName("Stasiek");
        krolik1.showName();
        System.out.println(krolik1.showName());

    }
}
