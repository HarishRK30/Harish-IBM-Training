package in;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 ="";
		char[] ch = str.toCharArray();
		for(int i= ch.length-1;i>=0;i--)
		{
		str2 += ch[i];
		}
		System.out.println(str2);
	}

}
