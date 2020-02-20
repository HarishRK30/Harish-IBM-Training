package org;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("G:\\Java\\Java\\testout.txt");    
             String s = "Welcome";
             byte b[] = s.getBytes();
             fout.write(b);
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  