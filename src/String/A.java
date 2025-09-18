package String;

public class A
{
	public static void main(String[] args) 
	{
		String a="Aashish Patil";
		
		StringBuilder rev= new StringBuilder(a);
		
		rev.reverse();
		
		
		System.out.println(rev.toString());
		
		
	}

}
