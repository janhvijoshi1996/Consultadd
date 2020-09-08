package com.prac.core.Assignment;

import java.util.Scanner;

public class Task2_2 
{
	private static double first;
	private static double second;
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number1-->");
		first=scan.nextInt();
		System.out.println("enter the number2-->");
		second=scan.nextInt();	
		System.out.println("select the operation");
		System.out.println("1.Addition    2.Substraction   3.Division   4.Multiplication   5.Average");
		Scanner se=new Scanner(System.in);
		String ele=se.nextLine();
		
		switch (ele)
		{
		case "1":{ System.out.println("Addition Result = "+(first+second));
				negativeCheck(first+second);
			break;
			}
		case "2":{ System.out.println("Substraction Result = "+(first-second));
				negativeCheck(first-second);
			break;	
			}
		case "3":{ System.out.println("Division Result = "+(first/second));
				negativeCheck(first/second);
			break;
			}
		case "4":{ System.out.println("Multiplication Result = "+(first*second));
				negativeCheck(first*second);
			break;
			}
		case "5":System.out.println("Average action");
		{
			averageCal(first, second);
			break;
		}
		
		}
	}
	public static void averageCal(double first, double second)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter more numbers--");
		double first1=s.nextInt();
		System.out.println("enter more numbers--");
		double first2=s.nextInt();
		System.out.println("Average of given 4 numbers is--"+(first+second+first1+first2)/4);
		negativeCheck((first+second+first1+first2)/4);
	}
	public static void negativeCheck(double result)
	{
		if (result<0)
		{
			System.out.println("OOPS option is returning a negative number");
		}
	}
}
