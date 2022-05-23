package crudoperation.service;

import crudoperation.dao.StudentDAO;
import crudoperation.dao.StudentDAOImpl;
import crudoperation.entities.Student;

public class StudentSerImpl implements StudentSer{
	private StudentDAO dao;
	
	public StudentSerImpl() {
		dao=new StudentDAOImpl();
	}

	@Override
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student st)
	{
		dao.beginTrasaction();
		dao.addStudent(st);
		dao.commitTrasaction();
		
	}

	@Override
	public void updateStudent(Student st) 
	{
		dao.beginTrasaction();
		dao.updateStudent(st);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeStudent(Student st) 
	{
		dao.beginTrasaction();
		dao.removeStudent(st);
		dao.commitTrasaction();
		
	}

}
