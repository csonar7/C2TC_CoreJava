package crudoperation.dao;

import crudoperation.entities.Admin;

public interface AdminDAO {
	
	Admin getAdminById(int id);
	void addAdmin(Admin ad);
	void updateAdmin(Admin ad);
	void removeAdmin(Admin ad);
	void commitTrasaction();
	void beginTrasaction();

}
