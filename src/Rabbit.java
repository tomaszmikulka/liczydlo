public class Rabbit {
    private int length;
    private String name;
    private boolean softness;

    Rabbit(int length, String name, boolean softness)
    {
        this.length = length;
        this.name = name;
        this.softness = softness;
    }
    public void changeName(String name){
        this.name = name;
    }
    public String showName(){
        return name;
    }
}
