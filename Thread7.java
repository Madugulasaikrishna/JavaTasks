class mythread extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println(getName()+" "+i);
		}
	}
}

class Thread7
{
	public static void main(String args[])
	{
	mythread m=new mythread();
	mythread m1=new mythread();
	mythread m2=new mythread();
	m.setName("First Child");
	m1.setName("Second Child");
	m2.setName("Third Child");
	m.start();
	m1.start();
	m2.start();
	System.out.println("The no. of active threads are "+Thread.activeCount());
	System.out.println("Is first thread active "+m.isAlive());
	System.out.println("Is second thread active "+m1.isAlive());
	System.out.println("Is third thread active "+m2.isAlive());
		for(int i=0; i<=5; i++)
		{
		System.out.println("Main Thread "+i);
		}
try
{
m.join();
m1.join();
m2.join();
}catch(InterruptedException ie)
{
System.out.println(ie);
}
	System.out.println("The no. of active threads are "+Thread.activeCount());
	System.out.println("Is first thread active "+m.isAlive());
	System.out.println("Is second thread active "+m1.isAlive());
	System.out.println("Is third thread active "+m2.isAlive());
	}
}