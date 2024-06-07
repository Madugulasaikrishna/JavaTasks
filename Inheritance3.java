class First {
    protected int a;

    public void reada() {
        a = 10;
    }
}

class Second extends First {
    protected int b;

    public void readb() {
        b = 20;
    }
}

class Third extends Second {
    private int c;

    public void readc() {
        c = 30;
    }

    public void print() {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Third t = new Third();

        
        t.reada();
        t.print();

        
        t.readb();
        t.print();

        
        t.readc();
        t.print();
    }
}
