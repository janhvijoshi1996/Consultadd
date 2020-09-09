package com.prac.core.Thread;

public class ThreadThree implements Runnable
{

	@Override
	public void run()
	{
		for (int i = 0; i < 20; i++)
		{
			System.out.println("thread name-->"+Thread.currentThread().getName()+" value--> "+"three");
		}
	}
	
}
