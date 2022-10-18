package client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.type.descriptor.java.LocalDateJavaDescriptor;
import crudoperation.entities.Admin;
import crudoperation.entities.Certificate;
import crudoperation.entities.College;
import crudoperation.entities.Placement;
import crudoperation.entities.Student;
import crudoperation.entities.User;
import crudoperation.service.AdminSer;
import crudoperation.service.AdminSerImpl;
import crudoperation.service.CollegeSer;
import crudoperation.service.CollegeSerImpl;
import crudoperation.service.PlacementSer;
import crudoperation.service.PlacementSerImpl;
import crudoperation.service.StudentSer;
import crudoperation.service.StudentSerImpl;
import crudoperation.service.UserSer;
import crudoperation.service.UserSerImpl;



public class Client {

	public static void main(String[] args) {
		
		StudentSer ss=new StudentSerImpl();
		CollegeSer cs=new CollegeSerImpl();
		PlacementSer ps=new PlacementSerImpl();
		AdminSer as=new AdminSerImpl();
		UserSer us=new UserSerImpl();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		College clg1=new College();
		clg1.setId(02565);
		clg1.setCollegeName("PSGVPM");
		clg1.setLocation("SHAHADA");
		
		
		College clg2 =new College();
		clg2.setId(02566);
		clg2.setCollegeName("DNPCOE");
		clg2.setLocation("Untawad");

		
		
		Student s1=new Student();
		s1.setName("Chetan");
		s1.setMarks(25.32);
		s1.setCourse("java");
		s1.setQualification("B.E");
		s1.setHallticketno(115577);
		s1.setYear(2020);
		
		
		Student s2 =new Student();
		s2.setName("Rushikesh");
		s2.setMarks(25.33);
		s2.setCourse("python");
		s2.setHallticketno(115588);
		s2.setQualification("B.E");
		s2.setYear(2021);
		
		
		
		Certificate c1=new Certificate();
		c1.setCertId(111111);
		c1.setStudent(s1);
		c1.setYear(2021);
		c1.setCollege(clg1);
		
		
		Certificate c2=new Certificate();
		c2.setCertId(222222);
		c2.setStudent(s2);
		c2.setYear(2020);
		c2.setCollege(clg2);
		
		
		Admin a1 = new Admin();
		a1.setId(007);
		a1.setName("james");
		a1.setPassword("james@007");
		
		
		Admin a2 = new Admin();
		a2.setId(002);
		a2.setName("Aniket");
		a2.setPassword("Ani@002");
		
		
		User u1 = new User();
		u1.setUserId(525);
		u1.setName("nisha");
		u1.setType("student");
		u1.setPassword("Pass@123");
		u1.setStudentAdmin(a1);
		
		
		User u2 = new User();
		u2.setUserId(625);
		u2.setName("moin");
		u2.setType("friend");
		u2.setPassword("Last@123");
		u2.setStudentAdmin(a2);
		
		
		LocalDate date1= LocalDate.of(2020, 05, 25);
		Placement p1=new Placement();
		p1.setPlaceId(8080);
		p1.setPname("Capgimini");
		p1.setDate(date1);
		p1.setQualification("B.E");
		p1.setYear(2020);
	
		
		LocalDate date2= LocalDate.of(2021, 01, 02);
		Placement p2=new Placement();
		p2.setPlaceId(5050);
		p2.setDate(date2);
		p2.setPname("TCS");
		p2.setQualification("B.E");
		p2.setYear(2021);
		
	
		
		s1.setCertificate(c1);
		s1.setCollege(clg1);
		em.persist(s1);
		
		s2.setCertificate(c2);
		s2.setCollege(clg2);
		em.persist(s2);
		
		
		
		em.persist(c1);
		
		em.persist(c2);
		
		p1.setCollege(clg1);
		em.persist(p1);
		
		p2.setCollege(clg2);
		em.persist(p2);
		
		u1.setStudentAdmin(a1);
		u1.setCollege(clg1);
		em.persist(u1);
		
		u2.setStudentAdmin(a2);
		u2.setCollege(clg2);
		em.persist(u2);
		
		c1.setCollege(clg1);
		em.persist(c1);
		
		c2.setCollege(clg2);
		em.persist(c2);
		
		
		
		System.out.println("Rows Inserted...");
		
		
			
		
		//retrive operation
		//p1= ps.findPlacementById(8080);
		//System.out.println(p1.getPlaceId()+" "+p1.getPname()+" "+p1.getQualification()+" "+p1.getYear()+" "+p1.getDate());
		
		
/*		//Update Operation
		//s2.setName("Priya");
		//s2.setQualification("Bsc");
		//ss.updateStudent(s2);
		u2.setUserId(625);
		u2.setName("moin");
		u2.setPassword("Pass@11");
		u2.setStudentAdmin(a2);
		us.updateUser(u2);
		System.out.println("Row updated");
	*/	
		
	/*	a2.setId(101);
		a2.setName("saniya");
		a2.setPassword("Pass@123");
		as.updateAdmin(a2);
		System.out.println("Row updated");
		*/
		
	/*	//Delete Operation
		u2=us.getUserById(525);
		us.removeUser(u2);
		System.out.println("Row deleted");
		*/
		
		
		
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		

	}

}
