//Code For Bitwise Operators

import java.io.*;
public class BitwiseOperators {
    public static void main(String[] args) {        
        int a = 5;
        int b = 3;
        System.out.println("Bitwise AND : " + (a & b));
        System.out.println("Bitwise OR : " + (a | b));
        System.out.println("Bitwise XOR : " + (a ^ b));
        System.out.println("Bitwise NOT a: " + ~a);
        System.out.println("Bitwise NOT b: " + ~b);
    }
}