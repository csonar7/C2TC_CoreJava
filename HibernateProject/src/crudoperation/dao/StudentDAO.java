package crudoperation.dao;

import crudoperation.entities.Student;

public interface StudentDAO {
	
	Student getStudentById(int id);
	void addStudent(Student st);
	void updateStudent(Student st);
	void removeStudent(Student st);
	void commitTrasaction();
	void beginTrasaction();
}
