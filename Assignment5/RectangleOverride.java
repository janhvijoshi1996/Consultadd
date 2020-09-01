package com.prac.String;

public class RectangleOverride extends Object
{
	private int length;
	private int width;
	
	public RectangleOverride(int length, int width)
	{
		//System.out.println("RectangleOverride Constructor Called--");
		this.length=length;
		this.width=width;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		RectangleOverride rec=(RectangleOverride) obj;
		if(rec.length==this.length && rec.width==this.width )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return length+","+ width;
	}
	
	
}
