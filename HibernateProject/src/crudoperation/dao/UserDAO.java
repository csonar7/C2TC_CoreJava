package crudoperation.dao;

import crudoperation.entities.User;

public interface UserDAO {
	User getUserById(int id);
	void addUser(User st);
	void updateUser(User st);
	void removeUser(User st);
	void commitTrasaction();
	void beginTrasaction();

}
