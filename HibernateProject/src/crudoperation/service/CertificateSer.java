package crudoperation.service;

import crudoperation.entities.Certificate;

public interface CertificateSer {
	Certificate findCertificateById(int id);
	void addCerti(Certificate cert);
	void updateCerti(Certificate cert);
	void removeCerti(Certificate cert);

}
