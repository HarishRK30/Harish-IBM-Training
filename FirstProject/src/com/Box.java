package com;

public class Box {
	int l,w,h;
	static int noofobjects =0;
	{
		noofobjects +=1;            //instance block
	}
	Box()
	{
		l=30;w=30;h=30;
	}
	Box(int l,int w,int h)
	{
		this.l =l;
		this.w =w;
		this.h =h;
	}
	
	public int getL() {
		return l;
	}


	public void setL(int l) {
		this.l = l;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}
	void calculatevolume()
	{
		int volume;
		volume = l*w*h;
		System.out.println(volume);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		Box b2 = new Box(30,30,30);
		b1.calculatevolume();
		b2.calculatevolume();
		System.out.println(Box.noofobjects);
		Box.noofobjects =3;
		System.out.println(Box.noofobjects);
	}

}
