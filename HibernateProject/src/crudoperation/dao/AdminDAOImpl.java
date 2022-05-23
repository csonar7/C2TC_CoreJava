package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.Admin;

public class AdminDAOImpl implements AdminDAO{
	private EntityManager em;
	
	public AdminDAOImpl() {
		
		this.em = JPAUtil.getEntityManager();
	}

	@Override
	public Admin getAdminById(int id) {
		Admin admin=em.find(Admin.class, id);
		
		return admin;
	}

	@Override
	public void addAdmin(Admin ad) {
		em.persist(ad);
		
	}

	@Override
	public void updateAdmin(Admin ad) {
		em.merge(ad);
		
	}

	@Override
	public void removeAdmin(Admin ad) {
		em.remove(ad);
		
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
