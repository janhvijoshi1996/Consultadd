package com.prac.core.Assignment;

public class Swapping 
{
	private int number1;
	private int number2;
	private int result;
	
	public Swapping(int number1, int number2)
	{
		this.number1=number1;
		this.number2=number2;
		
	}
	
	public void swapping() 
	{
		result=number1;
		number1=number2;
		number2=result;
		System.out.println("number1-->"+number1);
		System.out.println("number2-->"+number2);
	}
}
