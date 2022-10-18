package crudoperation.dao;

//import java.util.List;


import crudoperation.entities.College;


public interface CollegeDAO {
	College getCollegeById(int id);
	void addCollege(College cg);
	void updateCollege(College cg);
	void removeCollege(College cg);
	void commitTrasaction();
	void beginTrasaction();

}
