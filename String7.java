class String7
{
	public static void main(String args[])
	{
	String s="Rama";
	String s1="rama";
	boolean b=s.equals(s1);
	System.out.println("both are same "+b);
	
	b=s.equalsIgnoreCase(s1);
	System.out.println("both are same "+b);

	b=s.matches(s1);
	System.out.println("both are same "+b);
	}
}