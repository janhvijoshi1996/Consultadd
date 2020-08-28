package com.prac.core.java;

import com.prac.core.geo.Shape;

public class Triangle extends Shape 
{
	private int base;
	private int height;
	public Triangle()
	{
		System.out.println("Triangle constructor--");
		base=10;
		height=6;
		
	}
	
	@Override
	public void calShapeArea() 
	{
		System.out.println("Area of traangle is-->"+(0.5*base*height));
	}

}
