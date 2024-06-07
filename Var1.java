class example
{
private int a[];
	public void read(int x[])
	{
	a=x;
	}

	public void print()
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
	}
}

class Var1
{
	public static void main(String args[])
	{
	example ex=new example();
	int x[]={10,20,30,40,50};
	ex.read(x);
	ex.print();
	int y[]={100,200,300,400,500};
	ex.read(y);
	ex.print();
	int z[]={1000,2000,3000,4000,5000};
	ex.read(z);
	ex.print();
	int k[]={10,20};
	ex.read(k);
	ex.print();
	int p[]={100,200};
	ex.read(p);
	ex.print();
	}
}