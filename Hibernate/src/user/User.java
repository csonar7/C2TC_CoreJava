package user;

import demo.crudoperation.entities.Student;
import demo.crudoperation.service.StudentService;
import demo.crudoperation.service.StudentServiceImpl;

public class User {
	
	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		/*student.setName("Chetan");
		student.setMarks(25.32);
		service.addStudent(student);
		
		Student student2 =new Student();
		student2.setName("Aniket");
		student2.setMarks(25.31);
		service.addStudent(student2);
		
		Student student3=new Student();
		student3.setName("Roshan");
		student3.setMarks(24.36);
		service.addStudent(student3);
		
		Student student4 =new Student();
		student4.setName("Mayur");
		student4.setMarks(22.36);
		service.addStudent(student4);
		
		System.out.println("Rows Inserted..");*/
		
		//Retrieve Operation
		student =service.findStudentById(1);
		System.out.println("Name:- "+student.getName());
		System.out.println("ID:- "+student.getId());
		
	/*	//Update
		student =service.findStudentById(4);
		student.setName("Abhishek");
		student.setMarks(41);
		service.updateStudent(student);
		
		//delete
		student =service.findStudentById(4);
		System.out.println(student);
		service.removeStudent(student);
		System.out.println("Row Deleted..");
		*/
		
		
		
	}

}
