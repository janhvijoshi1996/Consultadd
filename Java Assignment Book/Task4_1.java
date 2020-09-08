package com.prac.core.Assignment;

import java.util.Scanner;

public class Task4_1
{
	public static void main(String[] args) 
	{
		System.out.println("enter string--");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String x;
		string.split(" ");
		char []array=string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
