package com;

public class StaticMethod {
	static int a=5;                //static variable
	int b=6;                       //non static and instance variable
	
	
	static void setA()
	{
		int c=0;                //local variable must be initialized
		System.out.println(c);
		System.out.println(a);
		//Inside Static method, Static variable cannot be accessed.
	}
	
	public static void main(String args[])
	{
		setA();
		System.out.println(a);
		StaticMethod obj = new StaticMethod();
		System.out.println(obj.b);
		
	}
	

}
