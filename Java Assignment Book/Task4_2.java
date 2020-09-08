package com.prac.core.Assignment;

import java.util.Scanner;

public class Task4_2 
{
	public static void main(String[] args)
	{
			System.out.println("enter the number of elements-->");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int array[]=new int[n];
			System.out.println("enter the numbers--");
			int sum=0;
			for (int i = 0; i < array.length; i++) 
			{
				array[i]=sc.nextInt();
			}
			for (int i = 0; i < array.length; i++)
			{
				for (int j = i+1; j < array.length; j++) 
				{
					if (array[i]>array[j])
					{
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
					
				}
			}
			for (int i = 1; i < array.length-1; i++) 
			{
				sum=sum+array[i];
			}
			System.out.println("sum-->"+sum);
	}
}
