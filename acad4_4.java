import java.util.Scanner;

public class acad {
	
	
	public static void main(String ar[])
	{
			Scanner S = new Scanner (System.in);
			int a,b;
			System.out.println ("Enter First Number ");
			a = S.nextInt();
			System.out.println ("Enter Last  Number ");
			b = S.nextInt();
			System.out.println ("Even Numbers between " +a + " and " + b);
			for (int i=a+1;i<b;i++)
			{
				if (i%2==0)
				{
					System.out.println (i);
				}
			}
			
			System.out.println ("Odd Numbers between " +a + " and " + b);
			for (int i=a+1;i<b;i++)
			{
				if (i%2!=0)
				{
					System.out.println (i);
				}
			}
	}

}