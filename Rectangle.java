package com.prac.core.java;

public class Rectangle 
{
	private int length;
	private int width;
	
	public Rectangle()
	{
		System.out.println("default constructor");
		length=10;
		width=5;
	}
	public Rectangle(int length, int width)
	{
		System.out.println("parameterised constructor");
		this.length=length;
		this.width=width;
	}
	public Rectangle(int length)
	{
		System.out.println("parameterised with length constructor");
		this.length=length;
		width=20;
	}
	public Rectangle(String print)
	{
		this();
		System.out.println("print-->"+print);
		System.out.println("length-->"+length);
		System.out.println("width-->"+width);
		
		
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
}
