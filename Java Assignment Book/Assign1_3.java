package com.prac.core.Assignment;

public class Assign1_3 
{
	private int number1;
	private int number2;
	private int z;
	
	public Assign1_3() {
		System.out.println("Constructor");
	}
	public int performAdd(int number1,int number2)
	{
		z=number1+number2;
		z=z+30;
		return z;
	}
	
}
