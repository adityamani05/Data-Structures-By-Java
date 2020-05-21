// Patterns In java * pattern
import static java.lang.System.*;
class Abc 
{
	public static void main(String args[])
	{
		Abc a = new Abc();
		for (int i=0;i<=5;i++)
		{
			out.println();
			for (int j=0;j<=i;j++) 
			{
				out.print("*");
			}
			for (int k=5;k>=i;k--) 
			{
				out.print("  ");		
			}
			for (int j=i;j>=0;j--) 
			{
				out.print("*");
			}
		}
		
	}

	
}

