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
    public void changeSoftness(boolean softness){
        this.softness = softness;
    }
    public  boolean showSoftness(){
        return softness;
    }
    public void changeLength(int length){
        this.length = length;
    }
    public int showLength(){
        return length;
    }
    public int klonowanie(int length){
        int nowy_krolik=length*5;
        this.length = nowy_krolik;
        return nowy_krolik;
    }
}
