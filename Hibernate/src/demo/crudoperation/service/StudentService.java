package demo.crudoperation.service;

import demo.crudoperation.entities.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student);
	
	public abstract void updateStudent(Student student);
	
	public abstract void removeStudent(Student student);

	public abstract Student findStudentById(int id);
	
	
}
