package com;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmployee w = new WageEmployee("santhosh",8030,30000,"Jaipur",300,10);
		System.out.println(w);
		System.out.println(w.calculateSalary());
		Employee e = new Employee("harish",1000,35000,"Chennai");
		System.out.println(e);
		
	}

}