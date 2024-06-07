class mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
		System.out.println(getName()+" ");
		}
	}
}

class Thread3
{
	public static void main(String args[])
	{
	mythread m=new mythread();
	m.setName("child thread");
	m.start();
	Thread t=Thread.currentThread();
		for(int i=0;i<=6;i++)
		{
		System.out.println(t.getName()+" ");
		}
	}
}