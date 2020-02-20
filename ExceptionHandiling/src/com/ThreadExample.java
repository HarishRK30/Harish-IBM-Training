package com;

public class ThreadExample extends Thread {
	
	public void run()

	{
		super.run();
		for(int i =1;i<=10;i++)
		{
			System.out.println("i"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		t1.start();
		try
		{
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			//e.printStackTrace();
		}
		t2.start();

	}

}
