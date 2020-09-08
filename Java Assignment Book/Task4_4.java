package com.prac.core.Assignment;

import java.util.Scanner;


public class Task4_4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string-->");
		String input=sc.nextLine();
		char array[]=input.toCharArray();		
		System.out.println("check-->"+check(array));
		reverseWord(input);
	}
	public static boolean check(char array[])
	{
		boolean c=true;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if (array[i]==array[j]) 
				{
					c=false;
					
				}
			}
			
		}
		return c;
	}
	public static void reverseWord(String input)
	{
		input.split(" ");
		System.out.println(input);
	}
	
}
