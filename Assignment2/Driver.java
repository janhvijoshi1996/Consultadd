package com.prac.core.geo;
import java.util.Scanner;

import com.prac.core.java.*;
import com.prac.core.manag.Optionclass;
public class Driver
{
	public static void main(String[] args)
	{
		Rectangle rec=new Rectangle();
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle();
		rec.area();
		rec1.setLength(20);
		rec1.setWidth(10);
		rec1.area();
		rec=rec1;
		rec.area();
		String input="null";
		System.out.println("thie is the rec2 object " +rec2);
		System.out.println("\n"+"Option part---------------");
		Rectangle rect=new Rectangle();
		while(!input.equals("0")) 
		{
			System.out.println("select any option-");
			System.out.println("--1. create rectangle object ");
			System.out.println("--2. display rectangle data ");
			System.out.println("--0. to exit ");
			Scanner sc=new Scanner(System.in);
			input=sc.nextLine();
		
		switch (input)
		{
			case "1":
				{
					System.out.println("create object ");
					Optionclass oc=new Optionclass();
					rect=oc.createRect();
					break;
				}
			case "2":
				{
					System.out.println("displaying rectangle data ");
					Optionclass oc=new Optionclass();
					oc.showRectangle(rect);
					break;
				}
			case "0": System.out.println("successfully exit. thankyou! ");
				break;
		}
		}
	}
	
}
