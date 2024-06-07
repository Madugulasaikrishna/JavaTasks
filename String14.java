class String14
{
	public static void main(String args[])
	{
	StringBuffer sb=new StringBuffer();
	System.out.println("The object is "+sb);
	System.out.println("The length is "+sb.length());
	System.out.println("The capacity is "+sb.capacity());
	
	System.out.println();
	
	StringBuffer sb1=new StringBuffer(10);
	System.out.println("The object is "+sb1);
	System.out.println("The length is "+sb1.length());
	System.out.println("The capacity is "+sb1.capacity());
	
	System.out.println();

	StringBuffer sb2=new StringBuffer("rama");
	System.out.println("The object is "+sb2);
	System.out.println("The length is "+sb2.length());
	System.out.println("The capacity is "+sb2.capacity());
	}
}