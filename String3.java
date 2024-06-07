class String3
{
	public static void main(String args[])
	{
	byte b[]={65,66,67,68,69,70};
	String s=new String(b);
	
	System.out.println("the object is "+s);
	System.out.println("the length is "+s.length());
	System.out.println("is it empty "+s.isEmpty());

	System.out.println();
	
	String s1=new String(b,1,5);
	System.out.println("the object is "+s1);
	System.out.println("the length is "+s1.length());
	System.out.println("is it empty "+s1.isEmpty());

	System.out.println();
	
	int x[]={65,66,67,68,69,70};
	String s2=new String(x,1,4);
	System.out.println("the object is "+s2);
	System.out.println("the length is "+s2.length());
	System.out.println("is it empty "+s2.isEmpty());
	}

}