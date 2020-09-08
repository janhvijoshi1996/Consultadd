package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int one=sc.nextInt();
		System.out.println("enter second number");
		int two=sc.nextInt();
		System.out.println("enter first number");
		int three=sc.nextInt();
		if (one<two&&two<three)
		{
			System.out.println("INCREASING");
		}
		else if (one>two&&two>three) 
		{
			System.out.println("DECREASING");
		}
		else
			System.out.println("neither increasing nor decreasing");
	}
}
