//Code For Assignment Operators

import java.io.*;
class AssignmentOperators{
    public static void main(String args[]){
        int a=10;
        System.out.println("+= is "+ (a+=2));
        System.out.println("-= is "+ (a-=2));
        System.out.println("*= is "+ (a*=2));
        System.out.println("/= is "+ (a/=2));
        System.out.println("%= is "+ (a%=2));
    }
}