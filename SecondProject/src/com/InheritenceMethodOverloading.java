package com;
class C         //parent class or super class
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	void showClass()
	{
		System.out.println("Class C");
	}
	
}
class D extends C                   //child class or sub class
{
	int b;
	void showClass()
	{
		super.showClass();
		System.out.println("Class D");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
public class InheritenceMethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D b = new D();
		System.out.println(b.a);
		b.showClass();
	}

}
