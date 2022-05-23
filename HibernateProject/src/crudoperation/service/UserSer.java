package crudoperation.service;

import crudoperation.entities.User;

public interface UserSer {
	User getUserById(int id);
	void addUser(User ur);
	void updateUser(User ur);
	void removeUser(User ur);
}
