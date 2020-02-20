package com;

public class WageEmployee extends Employee{
	int hours;
	int rate;
	public WageEmployee(String empName, int empID, int empSalary, String location, int rate, int hours) {
		super(empName, empID, empSalary, location);
		this.hours = hours;
		this.rate = rate;
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculateSalary() {                  //method overriding
		// TODO Auto-generated method stub
		return super.calculateSalary()+hours*rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	

	@Override
	public String toString() {
		return "WageEmployee [hours=" + hours + ", rate=" + rate + ", empName=" + empName + ", empID=" + empID
				+ ", empSalary=" + empSalary + ", location=" + location + "]";
	}


}
