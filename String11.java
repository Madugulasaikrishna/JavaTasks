class String11
{
	public static void main(String args[])
	{
	String s="rama rama rama rama rama";
	int x=s.indexOf("a");
	System.out.println("the first index of aja is "+x);
	x=s.lastIndexOf("a");
	System.out.println("the last index of a is "+x);

	x=s.indexOf("rama");
	System.out.println("the first index of a is "+x);
	x=s.lastIndexOf("rama");
	System.out.println("the last index of a is "+x);
	}
}