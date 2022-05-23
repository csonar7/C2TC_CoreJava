package crudoperation.service;

import crudoperation.entities.Placement;

public interface PlacementSer {
	Placement findPlacementById(int id);
	void addPlacement(Placement pl);
	void updatePlacement(Placement pl);
	void removePlacement(Placement pl);

}
