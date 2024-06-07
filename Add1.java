class Example {
    private int a;
    private int b;

    public void setValues() {
        a = 10;
        b = 20;
    }

    public int sum() {
        return a + b;
    }

    public void print() {
        System.out.println("Sum: " + sum());
    }
}

public class Add1 {
    public static void main(String[] args) {
        Example e = new Example();
        e.setValues();
        e.print();
    }
}
