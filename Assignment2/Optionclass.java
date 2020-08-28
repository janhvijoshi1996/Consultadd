package com.prac.core.manag;

import java.util.Scanner;

import com.prac.core.java.Rectangle;

public class Optionclass
{
	public Rectangle createRect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length--");
		int length=sc.nextInt();
		System.out.println("enter width--");
		int width=sc.nextInt();
		Rectangle rec=new Rectangle();
		rec.setLength(length);
		rec.setWidth(width);
		rec.area();
		return rec;
		
	}
	public void showRectangle(Rectangle rec)
	{
		System.out.println("length of rectangle is -->"+rec.getLength());
		System.out.println("length of rectangle is -->"+rec.getWidth());
	}
}
