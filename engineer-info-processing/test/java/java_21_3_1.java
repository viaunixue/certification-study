class Nero {
    static private Nero instance = null;
    private int count = 0;
    static public Nero get() {
        if (instance == null){
            instance = new Nero();
        }
        return instance;
    }
    public void count() { count++; }
    public int getCount() { return count;}
}

public class java_21_3_1 {
    public static void main(String[] args){
        Nero n1 = Nero.get();
        n1.count();

        Nero n2 = Nero.get();
        n2.count();

        Nero n3 = Nero.get();
        n3.count();

        System.out.println(n1.getCount());
    }
}
