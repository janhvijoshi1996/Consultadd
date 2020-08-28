package com.prac.core.geo;

import com.prac.core.java.Circle;
import com.prac.core.java.Rectangle;
import com.prac.core.java.ShapeManager;
import com.prac.core.java.Square;
import com.prac.core.java.Triangle;

public class InstDriver
{
	public static void main(String[] args) 
	{
		ShapeManager sm=new ShapeManager();
		sm.calShapeArea(new Rectangle());
		sm.calShapeArea(new Square());
		sm.calShapeArea(new Circle());
		sm.calShapeArea(new Triangle());
	}
}
