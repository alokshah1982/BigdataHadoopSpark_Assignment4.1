import java.util.Scanner;

public class acad {
	
	public static void Sum(int x,int y)
	{
		System.out.println ("First Number :" +x);
		System.out.println ("Second  Number :" +y);
		System.out.println ("Sum :" + (x+y));
	}
	public static void main(String ar[])
	{
			Scanner S = new Scanner (System.in);
			int a,b;
			System.out.println ("Enter First Number ");
			a = S.nextInt();
			System.out.println ("Enter Second  Number ");
			b = S.nextInt();
			Sum(a,b);
	}

}