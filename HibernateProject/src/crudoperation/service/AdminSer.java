package crudoperation.service;

import crudoperation.entities.Admin;

public interface AdminSer {
	Admin findAdminById(int id);
	void addAdmin(Admin ad);
	void updateAdmin(Admin ad);
	void removeAdmin(Admin ad);

}
