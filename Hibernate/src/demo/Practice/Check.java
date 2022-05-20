package demo.Practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Check {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee e1 =new Employee();
		e1.setEmpName("Chetan");
		e1.setEmpsal(24);
		
		
		Department d=new Department();
		d.setEmpname("HR");
		//d.setEmployees(e1);
		
		System.out.println("Row Inserted");
		
		

	}

}
