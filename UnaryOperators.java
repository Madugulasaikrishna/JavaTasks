//Code For Unary Operators

import java.io.*;
class UnaryOperators{
    public static void main(String args[]){
        int a=10;
        boolean num = true;
        boolean result = !num;
        System.out.println("Unary + is "+ (+a));
        System.out.println("Unary - is "+ (-a));
        System.out.println("Pre-Increment ++a is "+ (++a));
        System.out.println("Post-Increment a++ is "+ (a++));
        System.out.println("Pre-Decrement --a is "+ (--a));
        System.out.println("Post-Decrement a-- is "+ (a--));
        System.out.println("Logical Not is "+ (result));
        
    }
}