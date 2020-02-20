package com;
import java.util.*;
public class FactorialRecursion {
	int num;
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
		{
		num = n*fact(n-1);
		return num;
		}
	}
	void display(){
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FactorialRecursion fr = new FactorialRecursion();
		fr.fact(n);
		fr.display();
	}

}
