package com;
import java.io.IOException;
public class TestThread1 {
	static void validate(int age) throws IOException{  
	     if(age<18)  
	      throw new IOException("hfuy");
	    	
	     else  
	      System.out.println("welcome to vote");  
	   }  
	void display()
	{
		System.out.println("print");
	}
	   public static void main(String args[]) throws IOException, InterruptedException{  
	      validate(16);
	      Thread.sleep(300);
	      TestThread1 t1 = new TestThread1();
	      t1.display(); 
	  }  

}
