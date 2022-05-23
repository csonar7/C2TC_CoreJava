package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import crudoperation.entities.Certificate;
import crudoperation.entities.Student;
//import crudoperation.service.StudentSer;
//import crudoperation.service.StudentSerImpl;



public class Client {

	public static void main(String[] args) {
		
	/*	StudentSer ss=new StudentSerImpl();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Chetan");
		s1.setMarks(25.32);
		ss.addStudent(s1);
		*/
		/*CertificateSer cs=new CertificateSerImpl();
		Certificate c1=new Certificate();
		c1.setCertId(1111);
		c1.setYear(2022);
		cs.addCerti(c1);
		System.out.println("Rows Inserted..");*/
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s1=new Student();
		s1.setName("Chetan");
		s1.setMarks(25.32);
		s1.setCourse("java");
		s1.setQualification("B.E");
		
		
		Certificate c1=new Certificate();
		c1.setCertId(22);
		c1.setYear(2021);
		
		s1.setCertificate(c1);
		
		em.persist(s1);
		
		System.out.println("Rows Inserted...");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
		
		

	}

}
