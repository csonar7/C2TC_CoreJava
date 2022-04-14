package day38;
class Aa
{
	
}
public class EqualDemo {
	public static void main(String[] args) {
		Aa a = new Aa();
		Aa a1 = a;
		Aa a2 = new Aa();
		if(a==a1)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a==a2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
	}

}
