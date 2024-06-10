//Code For Instance Variable

/*Instance variables: These are variables declared within a class but outside any method, 
constructor, or block. Each instance of the class has its own copy of instance variables, 
and their values are specific to each instance.*/

import java.io.*;
public class InstanceVariable{
   // instance variable
   public String myVar="instance variable";
    
   public void myMethod(){
    	// local variable
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
   public static void main(String args[]){
      // Creating object
      InstanceVariable obj = new InstanceVariable();
    	
      System.out.println("Calling Method");
      obj.myMethod();
      System.out.println(obj.myVar);
   }
}