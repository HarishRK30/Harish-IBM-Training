package in;

class InnerClass {
	private int data = 30;
	class Inner{
		void msg()
		{
			System.out.println("data is "+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass obj = new InnerClass();
		InnerClass.Inner in = obj.new Inner();
		in.msg();

	}

}
