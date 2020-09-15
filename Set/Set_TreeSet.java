package com.prac.core.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.prac.core.java.Rectangle;

public class Set_TreeSet 
{
	public static void main(String[] args) 
	{
		Set<Rectangle> setobj=new TreeSet<Rectangle>();
		try {
		setobj.add(new Rectangle(10));
		}catch(Exception e) {
			System.out.println("first");
		}
		try {
			setobj.add(new Rectangle(10));
			}catch(Exception e) {
				System.out.println("second");
			}finally {
				System.out.println("finally");
			}
		try {
			setobj.add(new Rectangle(10));
			}catch(Exception e) {
				System.out.println("third");
			}
//		setobj.add(new Rectangle(20));
//		setobj.add(new Rectangle(10));
		
		//for each retrieve
		for (Rectangle rectangle : setobj) 
		{
			System.out.println("Area-->");
			rectangle.area();
		}
	}
}
