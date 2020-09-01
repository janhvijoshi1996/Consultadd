package com.prac.String;

public class StringAssignment 
{
	public static void main(String[] args)
	{
		String s1="TesTing";
		String s2="Testing";
		
		System.out.println("String Object--------");
		if(s1.equals(s2))
		{
			System.out.println("the values of two objects are EQUAL.");
		}
		else
			System.out.println("the values of two objects are NOT EQUAL");
	
		System.out.println("\n"+"value of object s1 is-->"+s1);
		System.out.println("value of object s2 is-->"+s2);
		
		RectangleOverride ro=new RectangleOverride(6, 11);
		RectangleOverride ro1=new RectangleOverride(6, 10);
		
		System.out.println("\n"+"Rectangle Object-------");
		if(ro.equals(ro1))
		{
			System.out.println("object equal");
		}
		else
			System.out.println("object not equal");
		
		System.out.println("\n"+"the value of object ro is "+ro.toString());
		System.out.println("the value of obect ro1 is "+ro1.toString());
	}
}
