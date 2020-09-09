package com.prac.core.Thread;

public class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("name of thread-->"+Thread.currentThread().getName()+" two ");
		}
	}
}
