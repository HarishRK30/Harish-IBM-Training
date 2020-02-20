package com;

interface runnable
{
	void run();
}
interface Swimable extends runnable
{
	//whatever we write in interface all are public static final 
	double speed = 34.99;
	//by default all methods are abstract
	void swim();
	void pause();
}
class AutomobileMain
{
	
	
}
class WaterAuto extends AutomobileMain implements Swimable
{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("100KM/Hr");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause for 30 minutes");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
		
	}
	
}


public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swimable w = new WaterAuto();                   //upcasting
		w.swim();
		w.pause();
		w.run();
		System.out.println(Swimable.speed);
	}

}
