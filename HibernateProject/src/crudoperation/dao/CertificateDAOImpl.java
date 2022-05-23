package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.Certificate;


public class CertificateDAOImpl implements CertificateDAO{
	private EntityManager em ;
	
	public CertificateDAOImpl() {
		this.em=JPAUtil.getEntityManager();
	}

	@Override
	public Certificate getCertificateById(int id) 
	{
		Certificate certy = em.find(Certificate.class, id);
		return certy;
	}

	@Override
	public void addCerti(Certificate cert) 
	{
		em.persist(cert);
		
	}

	@Override
	public void updateCerti(Certificate cert) 
	{
		em.merge(cert);
	}

	@Override
	public void removeCerti(Certificate cert) 
	{
		em.remove(cert);
		
	}

	@Override
	public void commitTrasaction() 
	{
		em.getTransaction().commit();
	}

	@Override
	public void beginTrasaction() 
	{
		em.getTransaction().begin();
		
	}

}
