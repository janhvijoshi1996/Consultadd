package com.prac.core.java;

import com.prac.core.geo.Shape;

public class Square extends Shape 
{
	private int size;
	public Square()
	{
		System.out.println("square constructor");
		size=10;
	}
	
	public void area()
	{
			System.out.println("area of square-->"+(size*size));
	}
	@Override
	public void calShapeArea() {
		area();
	}
}
