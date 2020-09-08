package com.prac.core.Assignment;

import java.util.Scanner;

public class Task4_3
{
	public static void main(String[] args) 
	{
		System.out.println("enter the String-->");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char []array=input.toCharArray();
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i]==' ')
			{
				for (int j = i; j < array.length-1; j++)
				{
					array[j]=array[j+1];
					array[j+1]='\u0000';
				}
				
			}
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);
		}
	}
	
}
