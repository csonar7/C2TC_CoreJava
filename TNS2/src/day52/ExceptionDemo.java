package day52;

public class ExceptionDemo {
	public void m1() throws Exception
	{
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Qt{
	public void m2() 
	{
		ExceptionDemo ed = new ExceptionDemo();
				try {
					ed.m1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//throw new ExceptionDemo();
	}
}