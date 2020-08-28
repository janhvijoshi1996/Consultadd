package com.prac.core.geo;

public class DriverSignleTonAssign
{
	public static void main(String[] args)
	{
		SingleTonAssign inst=SingleTonAssign.showCount();
		SingleTonAssign inst2=SingleTonAssign.showCount();
		
		if (inst==inst2)
		{
			System.out.println("same objects ");
		}
		else
		{
			System.out.println("different");
		}
	}
}
