class example
{
String s;
int a[];
	public void read(String st, int...x)
	{
	s=st;
	a=x;
	}
	public void print()
	{
	System.out.println("The length of the string is "+a.length);
		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]+" ");
		}
	System.out.println();
	}
}

class Var3
{
	public static void main(String args[])
	{
	example ex=new example();
	ex.read("rama",1,2,3,4,5);
	ex.print();
	ex.read("soma",10,20,30,40,50,60);
	ex.print();
	ex.read("sai",100,200,300,400,500,600,700);
	ex.print();
	}
}
	