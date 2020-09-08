package com.prac.core.Assignment;

public class Task2_5 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=6; i++)
		{
			if (i%3==0 &&i!=0)
			{
				continue;
			}
			else
				System.out.print(i);
		}
	}
}
