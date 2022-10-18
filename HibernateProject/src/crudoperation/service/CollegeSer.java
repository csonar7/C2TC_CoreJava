package crudoperation.service;

import crudoperation.entities.College;

public interface CollegeSer {
	College findCollegeById(int id);
	void addCollege(College cg);
	void updateCollege(College cg);
	void removeCollege(College cg);

}
