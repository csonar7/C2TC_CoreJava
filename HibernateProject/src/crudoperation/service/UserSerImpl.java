package crudoperation.service;

import crudoperation.dao.UserDAO;
import crudoperation.dao.UserDAOImpl;
import crudoperation.entities.User;

public class UserSerImpl implements UserSer{
	private UserDAO dao;
	
	public UserSerImpl() {
		dao=new UserDAOImpl();
	}

	@Override
	public User getUserById(int id) {
		User user =dao.getUserById(id);
		return user;
	}

	@Override
	public void addUser(User ur) {
		dao.beginTrasaction();
		dao.addUser(ur);
		dao.commitTrasaction();
		
	}

	@Override
	public void updateUser(User ur) {
		dao.beginTrasaction();
		dao.updateUser(ur);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeUser(User ur) {
		dao.beginTrasaction();
		dao.removeUser(ur);
		dao.commitTrasaction();
		
	}

}
