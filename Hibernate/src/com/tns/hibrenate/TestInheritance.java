package com.tns.hibrenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmpName("Chetan");
		e.setEmpsal(25800.258);
		em.persist(e);
		
		
		Manager m=new Manager();
		m.setDepartName("Core Java");
		m.setEmpName("Mayur");
		m.setEmpsal(258460.25);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted...");
		em.close();
		factory.close();
	}

}
