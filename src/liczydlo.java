public class liczydlo {
    public static void main(String[] args) {
        String [] liczydlo=new String[] {"2","3","7","3","3","5","2"};
        int count=0;
        for (String cyfry: liczydlo) {
            if (cyfry.equals("3"))
            System.out.println(count);
        }
    }
}
