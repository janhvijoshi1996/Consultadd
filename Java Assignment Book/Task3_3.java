package com.prac.core.Assignment;

import java.util.Scanner;

public class Task3_3 
{
	public static void main(String[] args) {
		System.out.println("enter the month-");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("this month has 31 days ");
		}
		else if(month==2)
		{
			System.out.println("this month has either 28 or 29 days ");
		}
		else if(month==4||month==6||month==9||month==11)
			System.out.println("this month has 30 days");
		else
			System.out.println("invalid details ");
	}
}
