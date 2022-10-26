public class program1 {
    public static void main(String[] args) {

        Car auto1 = new Car(4,5,6,"czerwony");
        Car auto2 = new Car(4,4,2,"niebieski");
        Rabbit krolik1 = new Rabbit(50,"Hanek",true);
        krolik1.changeName("Stasiek");
        krolik1.showName();
        System.out.println(krolik1.showName());
        krolik1.changeSoftness(false);
        System.out.println(krolik1.showSoftness());
        krolik1.changeLength(30);
        krolik1.showLength();
        System.out.println(krolik1.showLength());
        System.out.println(krolik1.klonowanie(60));
        System.out.println(krolik1.showLength());
    }
}
