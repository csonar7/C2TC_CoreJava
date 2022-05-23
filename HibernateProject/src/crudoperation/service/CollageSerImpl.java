package crudoperation.service;

import crudoperation.dao.CollageDAO;
import crudoperation.dao.CollageDAOImpl;
import crudoperation.entities.Collage;

public class CollageSerImpl implements CollageSer{
	CollageDAO dao;
	

	public CollageSerImpl() {
		this.dao=new CollageDAOImpl();
	}

	@Override
	public Collage findCollageById(int id) {
		Collage collage = dao.getCollageById(id);
		return collage;
	}

	@Override
	public void addCollage(Collage cg) {
		dao.beginTrasaction();
		dao.addCollage(cg);
		dao.commitTrasaction();
		
	}

	@Override
	public void updateCollage(Collage cg) {
		dao.beginTrasaction();
		dao.updateCollage(cg);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeCollage(Collage cg) {
		dao.beginTrasaction();
		dao.removeCollage(cg);
		dao.commitTrasaction();
		
	}

}
