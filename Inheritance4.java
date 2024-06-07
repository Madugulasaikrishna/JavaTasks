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
        System.out.println("a: " + a + ", b: " + b);
    }
}

class Third extends First {
    private int c;

    public void readc() {
        c = 30;
    }

    public void print() {
        System.out.println("a: " + a + ", c: " + c);
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Second s = new Second();

        s.reada();
        s.print();
        s.readb();
        s.print();

        Third t = new Third();
        
        t.reada();
        t.print();
        t.readc();
        t.print();
    }
}
