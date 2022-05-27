package crudoperation.dao;

/*import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;
*/
import javax.persistence.EntityManager;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;


import crudoperation.entities.Collage;


public class CollageDAOImpl implements CollageDAO{
	private EntityManager em;

	public CollageDAOImpl() {
		this.em=JPAUtil.getEntityManager();
	}

	@Override
	public Collage getCollageById(int id) {
		Collage collage =em.find(Collage.class, id);
		return collage;
	}

	@Override
	public void addCollage(Collage cg) {
		em.persist(cg);
		
	}

	@Override
	public void updateCollage(Collage cg) {
		em.merge(cg);
		
	}

	@Override
	public void removeCollage(Collage cg) {
		em.remove(cg);		
	}
	
	@Override
	public void commitTrasaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTrasaction() {
		em.getTransaction().begin();
		
	}

}
