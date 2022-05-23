package crudoperation.service;

import crudoperation.dao.CertificateDAO;
import crudoperation.dao.CertificateDAOImpl;
import crudoperation.entities.Certificate;

public class CertificateSerImpl implements CertificateSer{
	private CertificateDAO dao;
	

	public CertificateSerImpl() {
		dao=new CertificateDAOImpl();
	}

	@Override
	public Certificate findCertificateById(int id) {
		Certificate certificate = dao.getCertificateById(id);
		return certificate;
	}

	@Override
	public void addCerti(Certificate cert) {
		dao.beginTrasaction();
		dao.addCerti(cert);
		dao.commitTrasaction();
		
	}

	@Override
	public void updateCerti(Certificate cert) {
		dao.beginTrasaction();
		dao.updateCerti(cert);
		dao.commitTrasaction();
		
	}

	@Override
	public void removeCerti(Certificate cert) {
		dao.beginTrasaction();
		dao.removeCerti(cert);
		dao.commitTrasaction();
		
	}

}
