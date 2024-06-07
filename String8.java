//ASCII values of Uppercase || A-Z are 65-90
//ASCII values of Lowercase || a-z are 97-122


class String8
{
	public static void main(String args[])
	{
	String s="ramarao";
	String s1="Ramarao";
	
	int res=s.compareTo(s1);
		
		if(res>0)
		{
		System.out.println("First string is big");
		}
		else if(res<0)
		{
		System.out.println("Second string is big");
		}
		else
		{
		System.out.println("Both are same");
		}
res=s.compareToIgnoreCase(s1);
		if(res>0)
		{
		System.out.println("First string is big");
		}
		else if(res<0)
		{
		System.out.println("Second string is big");
		}
		else
		{
		System.out.println("Both are same");
		}
	}
}