package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private EntityManager entityManager;
	
	public StudentDAOImpl() {
		this.entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id)
	{
		Student student=entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student st) {
		entityManager.persist(st);
		
	}

	@Override
	public void updateStudent(Student st) {
		
		entityManager.merge(st);
	}

	@Override
	public void removeStudent(Student st) {
		entityManager.remove(st);
		
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTrasaction() {
		
		entityManager.getTransaction().begin();
		
	}

}
