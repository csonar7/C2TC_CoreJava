package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.User;

public class UserDAOImpl implements UserDAO{
	private EntityManager em;
	
	public UserDAOImpl() {
		this.em=JPAUtil.getEntityManager();
	}

	@Override
	public User getUserById(int id) {
		User user =em.find(User.class, id);
		return user;
	}

	@Override
	public void addUser(User st) {
		em.persist(st);
		
	}

	@Override
	public void updateUser(User st) {
		em.merge(st);
		
	}

	@Override
	public void removeUser(User st) {
		em.remove(st);
		
	}

	@Override
	public void commitTrasaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTrasaction() {
		em.getTransaction().begin();
		
	}

}
