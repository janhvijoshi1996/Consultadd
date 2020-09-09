package com.prac.core.Thread;

public class MyThread
{
	public static void main(String[] args) 
	{
		ThreadOne thread1=new ThreadOne();
		thread1.setPriority(4);
		thread1.setName("1111");
		thread1.start();
		ThreadTwo thread2=new ThreadTwo();
		thread2.setPriority(1);
		thread2.setName("2222");
		thread2.start();
		Runnable thread3=new ThreadThree();
		Thread thread=new Thread(thread3,"3333");
		thread.setPriority(7);
		thread.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("name of thread-->"+Thread.currentThread().getName()+" and value-->"+i);
		}
		System.out.println("----------Completed----------");
	}
}
