package com;

public class Student {
	String sName;
	int sID;
	String sCourse;
	Student()                           //default constructor
	{
		sName ="harish";
		sID = 432;
		sCourse = "be";
	}

	Student (String sName, int sID, String sCourse) {    //parameterized constructor
		this.sName = sName;
		this.sID = sID;
		this.sCourse = sCourse;
		
	}
	void details(String sName, int sID, String sCourse) {   //method
		this.sName = sName;
		this.sID = sID;
		this.sCourse = sCourse;
	}
	void display()
	{
		System.out.println(sName+" "+sID+" "+sCourse);
	}

	

	public static void main(String[] args) {
	    Student s1 = new Student();
		//s1.setSt("harish",423,"be");
		Student s2 = new Student("sujay",403,"be");
		//s2.setSt("santos", 432,"BE");
		Student s3 = new Student();
		s3.details("p",43,"be");       //calls method
		s1.display();
		s2.display();
		s3.display();

	}

}
