package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_5
{
	public static void main(String[] args) {
		System.out.println("enter the number-->");
		long number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextLong();
		int count=0;
		int sum=0;
		while(number!=0)
		{
			sum=(int)(number%10)+sum;
			number=number/10;
			
			count++;
		}
		System.out.println("count-->"+count);
		System.out.println("Sum-->"+sum);
	}
}
