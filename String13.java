class String13
{
	public static void main(String args[])
	{
	String s="rama rama rama rama";
	String s1="rao";
	String s2=s.concat(s1);
	System.out.println("the final string is "+s2);
	String s3=s.replace("a","A");
	System.out.println("the final object is "+ s3);
	String s4=s.replaceFirst("rama","RAMA");
	System.out.println("the final object is "+ s4);
	String s5=s.replaceAll("rama","RAMA");
	System.out.println("the final object is "+ s5);
	}
}