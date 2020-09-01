package com.prac.core.Array;

import java.util.Scanner;

public class ArrayAssign {
	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		int value[]=new int[26];
		int smallvalue[]=new int[26];
		int space=0;
		
		char []array=input.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			if((int)(array[i])>=97&&(int)(array[i])<=122)
			{
				int position=array[i]-97;
				smallvalue[position]=++smallvalue[position];
			}
			else if((int)(array[i])>=65&& (int)(array[i])<=90)
			{
				int position=array[i]-65;
				value[position]=++value[position];
			}
			else if((int)(array[i])==32)
				space++; 
		} 
		for (int i = 0; i < smallvalue.length; i++)
		{
			if (smallvalue[i]>0)
			{
				System.out.println((char)(i+97)+" = "+smallvalue[i]);
			}
		}
		for (int i = 0; i < value.length; i++) {
			if(value[i]>0)
			{
				System.out.println((char)(i+65)+" = "+value[i]);
			}
		}
		System.out.println("Space=="+space);
	}
}
