package com;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("program excecution start");
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Program execution Done");

	}
}
