package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.Placement;

public class PlacementDAOImpl implements PlacementDAO{
	private EntityManager em;
	
	public PlacementDAOImpl() {
		this.em=JPAUtil.getEntityManager();
	}

	@Override
	public Placement getPlacementById(int id) {
		Placement placement=em.find(Placement.class, id);
		return placement;
	}

	@Override
	public void addPlacement(Placement pl) {
		em.persist(pl);
		
	}

	@Override
	public void updatePlacement(Placement pl) {
		em.merge(pl);
		
	}

	@Override
	public void removePlacement(Placement pl) {
		em.remove(pl);
		
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
