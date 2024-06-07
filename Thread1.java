class first
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("First "+i);
		}
	}
}

class Thread1
{
	public static void main(String args[])
	{
	first f=new first();
	f.run();
		for(int i=0;i<5;i++)
		{
		System.out.println("Main "+i);
		}
	}
}