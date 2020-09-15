package com.prac.core.java;

import com.prac.core.geo.Shape;

public class Rectangle extends Shape
{
	public static int count=0;
	private int length;
	private int width;
	
	//block initialization 
	{
		System.out.println("\n"+"----this is block initialization---");
		length=100;
		width=50;
		System.out.println("object initialized done--");
		System.out.println("instance level");
	}
	//class level block initialization 
	static 
	{
		System.out.println("\n"+"----this is class level block initialization---");
		System.out.println("static block ");
	}
	
	public Rectangle()
	{
		System.out.println("default constructor");
		length=10;
		width=5;
		count++;
	}
	public Rectangle(int length, int width)
	{
		System.out.println("parameterised constructor");
		this.length=length;
		this.width=width;
		count++;
	}
	public Rectangle(int length)
	{
		System.out.println("parameterised with length constructor");
		this.length=length;
		width=20;
		count++;

	}
	public Rectangle(String print)
	{
		//this();
		System.out.println("print-->"+print);
		System.out.println("length-->"+length);
		System.out.println("width-->"+width);
		count++;		
	}
	public void area()
	{
		System.out.println("area of rectangle is-->"+(length*width));
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int getLength()
	{
		return this.length;
	}
	public int getWidth()
	{
		return this.width;
	}
	@Override
	public void calShapeArea() {
		area();
		
	}
	public static int calInstance()
	{
		return count;
	}
}
