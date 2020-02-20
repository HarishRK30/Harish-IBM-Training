package com;
public class StaticKeyword{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   StaticKeyword(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){
	   System.out.println(rollno+" "+name+" "+college);
	   }  
//Test class to show the values of objects   
 public static void main(String args[]){  
 StaticKeyword s1 = new StaticKeyword(111,"Karan");  
 StaticKeyword s2 = new StaticKeyword(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //StaticKeyword.college="BBDIT";  
 s1.display();  
 s2.display();  
 }  
}  
