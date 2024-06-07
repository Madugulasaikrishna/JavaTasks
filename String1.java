class String1
{
	public static void main(String args[])
	{
	String s=new String();
	System.out.println("the object is "+s);
	System.out.println("the length is "+s.length());
	System.out.println("is it empty "+s.isEmpty());

	System.out.println();
	
	char x[]={'p','r','s','i','n','f','o'};
	String s1=new String(x);
	System.out.println("the object is "+s1);
	System.out.println("the length is "+s1.length());
	System.out.println("is it empty "+s1.isEmpty());
	
	System.out.println();

	String s2=new String(x,1,4);
	System.out.println("the object is "+s2);
	System.out.println("the length is "+s2.length());
	System.out.println("is it empty "+s2.isEmpty());

	System.out.println();

	String s3=new String(s2);
	System.out.println("the object is "+s3);
	System.out.println("the length is "+s3.length());
	System.out.println("is it empty "+s3.isEmpty());
	}
}