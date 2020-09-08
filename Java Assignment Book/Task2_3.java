package com.prac.core.Assignment;

public class Task2_3
{
	private static int a=10;
	private static int b=20;
	private static int c=30;
	
	public static void main(String[] args) {
		int avg=(a+b+c)/3;
		System.out.println("Average = "+avg);
	
		if(avg>a&&avg>b&&avg>c)
		{
			System.out.println("Average is higher than a,b,c");
		}
		else
		{
			if(avg>a&&avg>b)
			{
				System.out.println("average is higer than a,b");
			}
			else
			{
				if (avg>a&&avg>c)
				{
					System.out.println("average is higher than a,c");
				}
				else
				{
					if(avg>b&&avg>c)
					{
						System.out.println("average is higher than b,c");
					}
					else
					{
						if (avg>a)
						{
							System.out.println("average is just higher than a" );
						}
						else
						{
							if(avg>b)
							{
								System.out.println("average is just higher than b");
							}
							else
							{
								if (avg>c)
								{
									System.out.println("average is just higher than c");
								}
							}
						}
					}
				}
			}
		}
	
	}
}
