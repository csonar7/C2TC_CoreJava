package day41;
abstract class Car{
	Car car;
	public void start() {
		System.out.println("Im in Start method of car");
	}
	public Car getCar() {
		System.out.println("I want car object");
		return car;
		
	}
	public void stop() {
		System.out.println("Im in stop method of Car");
	}
}
class Maruti extends Car {
	Maruti m;
	public void start() {
		System.out.println("Im in Start method of Maruti car");
	}
	public Maruti getCar1() {
		System.out.println("I want Maruti car object");
		return m;
		
	}
}
class Duster extends Car {
	Duster d;
	public Duster getCar() {
		System.out.println("I want Duster car object");
		return d;
		
	}
}
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maruti m = new Maruti();
				//Car c = m; //up casting subclass to superclass 
		        Car c = new Maruti();
		        Maruti m = (Maruti)c;//downcasting superclass to subclass 
		        m.getCar1();
		     Car x = new Duster();
		       c.start();
		       x.start();

	}

}
