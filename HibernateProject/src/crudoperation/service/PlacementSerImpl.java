package crudoperation.service;

import crudoperation.dao.PlacementDAO;
import crudoperation.dao.PlacementDAOImpl;
import crudoperation.entities.Placement;

public class PlacementSerImpl implements PlacementSer{
	private PlacementDAO dao;
	
	

	public PlacementSerImpl() {
		dao=new PlacementDAOImpl();
	}

	@Override
	public Placement findPlacementById(int id) {
		Placement placement = dao.getPlacementById(id);
		return placement;
	}

	@Override
	public void addPlacement(Placement pl) {
		dao.beginTrasaction();
		dao.addPlacement(pl);
		dao.commitTrasaction();
		
	}

	@Override
	public void updatePlacement(Placement pl) {
		dao.beginTrasaction();
		dao.updatePlacement(pl);
		dao.commitTrasaction();
		
	}

	@Override
	public void removePlacement(Placement pl) {
		dao.beginTrasaction();
		dao.removePlacement(pl);
		dao.commitTrasaction();
		
	}

}
