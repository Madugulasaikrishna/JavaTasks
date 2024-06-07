class example
{
private int a[];

	public void read(int...x)
	{
	a=x;
	System.out.println("the length of the string is "+a.length);
	}
	public void print()
	{
		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]+" ");
		}
	System.out.println();
	}
}

class Var2
{
	public static void main(String args[])
	{
	example ex=new example();
	ex.read(1,2,3,4,5);
	ex.print();
	ex.read(10,20,30,40,50);
	ex.print();
	ex.read(100,200,300,400,500);
	ex.print();
	}
}