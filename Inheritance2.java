class Student {
    protected int sno, m1, m2, m3, tot;
    protected double avg;

    public void read() {
        sno = 101;
        m1 = 55;
        m2 = 85;
        m3 = 45;
    }
}

class Marks extends Student {
    public int findTot() {
        tot = m1 + m2 + m3;
        return tot;
    }

    public double findAvg() {
        avg = findTot() / 3.0;
        return avg;
    }

    public void print() {
        System.out.println("Student No: " + sno);
        System.out.println("Total Marks: " + findTot());
        System.out.println("Average Marks: " + findAvg());
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.read();
        m.print();
    }
}
