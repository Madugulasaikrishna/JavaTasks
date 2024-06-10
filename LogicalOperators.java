//Code For Logical Operators

import java.io.*;
class LogicalOperators{
    public static void main(String args[]){
        int a=10, b=20, c=30;
        System.out.println("&& is "+ (a>b && b>c));
        System.out.println("&& is "+ (a<b && b<c));
        System.out.println("&& is "+ (a>b || b>c));
        System.out.println("&& is "+ (a<b || b<c));
    }
}