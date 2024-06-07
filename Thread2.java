class Thread2
{
	public static void main(String args[])
	{
	Thread t=Thread.currentThread();
	System.out.println(t);
	System.out.println("The name of the thread is "+t.getName());
	System.out.println("The priority of the thread is "+t.getPriority());
	t.setPriority(6);
	System.out.println();
	System.out.println(t);
	System.out.println("The name of the thread is "+t.getName());
	System.out.println("The priority of the thread is "+t.getPriority());
	}
}