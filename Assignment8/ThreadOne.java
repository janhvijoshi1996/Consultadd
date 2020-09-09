package com.prac.core.Thread;

public class ThreadOne extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <20 ; i++)
		{
			System.out.println("name of thread-->"+Thread.currentThread().getName()+" value-->"+(i*4));
		}
	}
}
