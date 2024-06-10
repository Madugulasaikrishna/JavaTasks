//Code For Static Variable

/*Static variables: These variables are declared with the 'static' keyword within a class but outside any method, 
constructor, or block. They are shared among all instances of a class and retain their value even after the instance 
is destroyed.*/

import java.io.*;
class StaticVariable{
	public static String name = "Saikrishna";
	public static void main(String args[]){
		System.out.println(name);
	}
}