package crudoperation.dao;

import crudoperation.entities.Placement;

public interface PlacementDAO {
	
	Placement getPlacementById(int id);
	void addPlacement(Placement pl);
	void updatePlacement(Placement pl);
	void removePlacement(Placement pl);
	void commitTrasaction();
	void beginTrasaction();

}
