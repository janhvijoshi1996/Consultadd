package com.prac.core.Assignment;

import java.util.Scanner;

public class Task2_8 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character--");
		char input=sc.next().charAt(0);
		while(input!='0')
		{
			if(input=='r'||input=='a'||input=='n'||input=='d'||input=='o'||input=='m'||
					input=='R'||input=='A'||input=='N'||input=='D'||input=='O'||input=='M')
			{
				System.out.println("FOUND");
				System.out.println("enter any character--");
				input=sc.next().charAt(0);
			}
		else
			{
				System.out.println("NOT FOUND");
				System.out.println("enter any character--");
				input=sc.next().charAt(0);
			}
		}
	}
}
