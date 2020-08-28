package com.prac.core.java;

import com.prac.core.geo.Shape;

public class Circle extends Shape
{
	private static int radius;
	private final double pi=3.14;
	public Circle() 
	{
		radius=7;
		System.out.println("circle constructor--");
	}
	@Override
	public void calShapeArea() {
		System.out.println("Area of circle is-->"+(pi*radius*radius));
	}

}
