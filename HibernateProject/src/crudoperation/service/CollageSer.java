package crudoperation.service;

import crudoperation.entities.Collage;

public interface CollageSer {
	Collage findCollageById(int id);
	void addCollage(Collage cg);
	void updateCollage(Collage cg);
	void removeCollage(Collage cg);

}
