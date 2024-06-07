class String5
{
	public static void main(String args[])
	{
	char x[]={'r','a','m','a','r','a','o'};
	String s=new String(x);
	System.out.println("the object is "+s);
	System.out.println("the length of the object is "+s.length());
	System.out.println("is it empty "+s.isEmpty());

	System.out.println();

	char y[]=s.toCharArray();
		for(int i=0;i<y.length;i++)
		{
		System.out.print(y[i]+" ");
		}
	
	System.out.println();
	
	byte b[]={65,66,67,68,69,70};
	String s1=new String(b);
	System.out.println("the object is "+s1);

	System.out.println();
	
	byte bb[]=s1.getBytes();
		for(int i=0;i<bb.length;i++)
		{
		System.out.print(bb[i]+" ");
		}
	}
}