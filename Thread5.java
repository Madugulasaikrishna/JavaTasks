class mythread extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
		System.out.println(getName()+" "+i);
		}
	}
}

class mythread1 extends Thread
{
	public void run()
	{
		for(int i=100; i<=105; i++)
		{
		System.out.println(getName()+" "+i);
		}
	}
}

class Thread5
{
	public static void main(String args[])
	{
	mythread m=new mythread();
	m.setName("First Child");
	m.start();
	
	mythread m1=new mythread();
	m1.setName("Second Child");
	m1.start();
	}
}