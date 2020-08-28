package com.prac.core.geo;

public class SingleTonAssign 
{
	private static int countVar;
	private static SingleTonAssign instance;
	 
	private SingleTonAssign()
	{
		System.out.println("SingleToneAsssign Constructor called----"); 
		countVar++;
	}
	
	
	static {	
			System.out.println("static block");
			instance=new SingleTonAssign();
	}		
	
	public static SingleTonAssign showCount()
	{
		System.out.println("Count-->"+countVar);
		return instance;
	}
}
