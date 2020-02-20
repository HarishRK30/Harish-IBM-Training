package com;

public class MethodOverloading {
	//with the help of Method Overloading we are achieving compile time polymorphism.
	
	double add(int a,double b) {
		
		return a+b;
	}
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(5, 4.9866545434876));
		System.out.println(obj.add(5, 4));
		System.out.println(obj.add(5.879878998, 6.876987870));
		
		

	}

}
