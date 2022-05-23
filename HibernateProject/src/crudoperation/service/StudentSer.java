package crudoperation.service;

import crudoperation.entities.Student;

public interface StudentSer {
	Student findStudentById(int id);
	void addStudent(Student st);
	void updateStudent(Student st);
	void removeStudent(Student st);

}
