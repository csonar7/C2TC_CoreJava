package crudoperation.service;

import crudoperation.dao.CollegeDAO;
import crudoperation.dao.CollegeDAOImpl;
import crudoperation.entities.College;

public class CollegeSerImpl implements CollegeSer{
	CollegeDAO dao;
	

	public CollegeSerImpl() {
		this.dao=new CollegeDAOImpl();
	}

	@Override
	public College findCollegeById(int id) {
		College College = dao.getCollegeById(id);
		return College;
	}

	@Override
	public void addCollege(College cg) {
		dao.beginTrasaction();
		dao.addCollege(cg);
		dao.commitTrasaction();
		
	}

	@Override
	public void updateCollege(College cg) {
		dao.beginTrasaction();
		dao.updateCollege(cg);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeCollege(College cg) {
		dao.beginTrasaction();
		dao.removeCollege(cg);
		dao.commitTrasaction();
		
	}

}
