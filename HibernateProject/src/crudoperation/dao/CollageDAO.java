package crudoperation.dao;

//import java.util.List;


import crudoperation.entities.Collage;


public interface CollageDAO {
	Collage getCollageById(int id);
	void addCollage(Collage cg);
	void updateCollage(Collage cg);
	void removeCollage(Collage cg);
	void commitTrasaction();
	void beginTrasaction();

}
