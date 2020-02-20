package in;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
	}

}
