package in;
import java.util.*;
public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String emp = "";
		char[] ch = str.toCharArray();
		for(int i= ch.length-1;i>=0;i--)
		{
		emp += ch[i];
		}
		if (str.equals(emp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
