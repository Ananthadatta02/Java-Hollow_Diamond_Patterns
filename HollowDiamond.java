package star_patterns;

import java.util.Scanner;

public class HollowDiamond 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = s.nextInt();
		for(int i=1;i<size;i++)
			{
				for(int j=i;j<size;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<i;j++)
				{
					if(j==1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					if( j==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			for(int i=1;i<=size;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int j=i;j<size;j++)
				{
					if(j==i )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=i;j<=size;j++)
				{
					if(j==size)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
	}
}
