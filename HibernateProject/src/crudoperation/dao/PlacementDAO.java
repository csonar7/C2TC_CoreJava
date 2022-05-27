package crudoperation.dao;

//import java.util.List;


import crudoperation.entities.Placement;

public interface PlacementDAO {
	
	Placement getPlacementById(int id);
	void addPlacement(Placement pl);
	void updatePlacement(Placement pl);
	void removePlacement(Placement pl);
	//public List<Placement> getAllBooks();
	//public List<Placement> getStudentByMarks( double m);
	void commitTrasaction();
	void beginTrasaction();

}
