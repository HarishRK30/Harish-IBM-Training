package com;

class A          //parent class or super class
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
class B extends A                  //child class or sub class
{
	int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}


public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.a);
	}

}
