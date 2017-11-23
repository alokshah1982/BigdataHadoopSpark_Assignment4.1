import java.util.Scanner;

public class acad {
	
	
	public static void main(String ar[])
	{
			int i,j,t;
			Scanner S = new Scanner (System.in);
			int a[]= {45,23,5,33,6};
			System.out.println ("Given Array ");
			
			System.out.println ("Given Array Before Sorting ");
			for (i=0;i<a.length;i++)
			{
				System.out.println (a[i]);
			}
			for (i=0;i<4;i++)
			{
				for (j=0;j<5-i-1;j++)
				{
					if (a[j] < a[j+1])
					{
						t = a[j];
						a[j] = a[j+1];
						a[j+1] = t;
					}
				}
			}
			System.out.println ("Given Array in descending order After Sorting ");
			for (i=0;i<a.length;i++)
			{
				System.out.println (a[i]);
			}
			
	}

}
