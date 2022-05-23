package crudoperation.dao;

import crudoperation.entities.Certificate;

public interface CertificateDAO {
	
	Certificate getCertificateById(int id);
	void addCerti(Certificate cert);
	void updateCerti(Certificate cert);
	void removeCerti(Certificate cert);
	void commitTrasaction();
	void beginTrasaction();

}
