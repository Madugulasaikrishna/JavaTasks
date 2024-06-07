class First {
    protected int a;
    public void reada() {
        a = 10;
    }
}

class Second extends First {
    private int b;
    public void readb() {
        b = 20;
    }
    
    public void print() {
        System.out.println(a + " " + b);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Second s = new Second();
        s.reada();
        s.readb();
        s.print();
    }
}