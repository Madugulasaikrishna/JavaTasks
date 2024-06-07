class String6
{
	public static void main(String args[])
	{
	char x[]={'r','a','m','a','r','a','o'};
	String s=new String(x);
	 
	char y[]=new char[4];
	s.getChars(1,4,y,0);
		for(int i=0;i<y.length;i++)
		{
		System.out.print(y[i]);
		}
	}
}