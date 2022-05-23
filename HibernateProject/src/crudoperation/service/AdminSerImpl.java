package crudoperation.service;

import crudoperation.dao.AdminDAO;
import crudoperation.dao.AdminDAOImpl;
import crudoperation.entities.Admin;

public class AdminSerImpl implements AdminSer{
	AdminDAO dao;
	
	public AdminSerImpl() {
		this.dao=new AdminDAOImpl();
	}

	@Override
	public Admin findAdminById(int id) {
		Admin admin =dao.getAdminById(id);
		return admin;
	}

	@Override
	public void addAdmin(Admin ad) {
		dao.beginTrasaction();
		dao.addAdmin(ad);		
		dao.commitTrasaction();
	}

	@Override
	public void updateAdmin(Admin ad) {
		dao.beginTrasaction();
		dao.updateAdmin(ad);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeAdmin(Admin ad) {
		dao.beginTrasaction();
		dao.removeAdmin(ad);
		dao.commitTrasaction();
		
	}

}
