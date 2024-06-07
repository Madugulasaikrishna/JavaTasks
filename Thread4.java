class mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println(getName() + " ");
		}
	}
}

class Thread4
{
	public static void main(String args[])
	{
	mythread m=new mythread();
	m.setName("First Child");
	m.start();
	
	mythread m1=new mythread();
	m1.setName("Second Child");
	m1.start();

	mythread m2=new mythread();
	m2.setName("Third Child");
	m2.start();
	
	Thread t=Thread.currentThread();
		for(int i=1; i<=5; i++)
		{
		System.out.println(t.getName()+" "+i);
		}
	}
}
	
