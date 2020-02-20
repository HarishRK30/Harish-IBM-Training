package in;
import java.util.*;
public class FrequenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int counter =0;
		String str = sc.next();
		char[] c = str.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(ch == c[i])
			{
				counter++;
			}
			
		}
		System.out.println(counter);
	}

}
