package day60;

public abstract class Ab {
	
	//abstract public void m1();
	
	public void m2() 
	{
		System.out.println("this is a concrete Method(Non abstract)");
	}
	Ab1 a=new Ab1();
	
	Ab n =new Ab1();
}

class Ab1 extends Ab{
	
	Ab c =new Ab1();
	//Ab1 m =new Ab();
	public void m1()
	{
		
	}
}
