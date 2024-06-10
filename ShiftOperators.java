//Code For Shift Operators

import java.io.*;
public class ShiftOperators{
    public static void main(String[] args) {
        int a = 10, b=20;
        int resultLeftShift = a << 2;  
        System.out.println("Left Shift result: " + resultLeftShift);
        int resultRightShift = b >> 2;  
        System.out.println("Right Shift result: " + resultRightShift);
    }
}