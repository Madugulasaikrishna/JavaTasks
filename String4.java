class String4
{
	public static void main(String args[])
	{
	char x[]={'p','r','s','i','n','f','o'};
	String s=new String(x);
	System.out.println("the object is "+s);
	System.out.println("the char at index 2 is "+s.charAt(2));

	char y[]=s.toCharArray();
		for(int i=0;i<y.length;i++)
		{
		System.out.println(y[i]);
		}
	
	byte b[]={65,66,67,68,69,70};
	String s1=new String(b);
	System.out.println("the object is "+s1);
	
	byte bb[]=s1.getBytes();
		for(int i=0;i<bb.length;i++)
		{
		System.out.print(bb[i]+",");
		}
	}
}