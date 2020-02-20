package com;

public class Employee{
	String empName;
	int empID, empSalary;
	String location;
	
	public Employee(String empName, int empID, int empSalary, String location) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		this.location = location;
	}
	int calculateSalary()
	{
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empSalary=" + empSalary + ", location="
				+ location + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


}
