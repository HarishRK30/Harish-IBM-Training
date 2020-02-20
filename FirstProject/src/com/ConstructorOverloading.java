package com;

public class ConstructorOverloading {
	int l,w,h;
	ConstructorOverloading()
	{
		System.out.println("Box()");
	}
	ConstructorOverloading(int l)
	{
		this();
		System.out.println("Box(1)");
		this.l=1;
	}
	ConstructorOverloading(int l, int w)
	{
		this(l);
		System.out.println("Box(l,w)");
		this.l=l;
		this.w=w;
	}
	ConstructorOverloading(int l, int w, int h)
	{
		this(l,w);
		System.out.println("Box(l,w,h)");
		this.l=l;
		this.w=w;
		this.h=l;
	}
	void display()
	{
		System.out.println(l+" "+w+" "+h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj = new ConstructorOverloading(2,3,4);
		obj.display();

	}

}
