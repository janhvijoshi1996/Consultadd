package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_1 
{
	public static void main(String[] args) {
		System.out.println("enter the number-");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for (int i = 1; i <=10; i++)
		{
			System.out.println(number+" * "+i+" = "+i*number);
		}
	}
}
