import java.util.Scanner;

public class acad {
	
	
	public static void main(String ar[])
	{
			Scanner S = new Scanner (System.in);
			int a;
			System.out.println ("Enter Any Number ");
			a = S.nextInt();
			
			for (int i=1;i<=10;i++)
			{
				System.out.println (a + " x " + i + " = " + a*i);
			}
			
			
	}

}