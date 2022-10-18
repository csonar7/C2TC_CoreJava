package crudoperation.dao;

/*import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;
*/
import javax.persistence.EntityManager;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;


import crudoperation.entities.College;


public class CollegeDAOImpl implements CollegeDAO{
	private EntityManager em;

	public CollegeDAOImpl() {
		this.em=JPAUtil.getEntityManager();
	}

	@Override
	public College getCollegeById(int id) {
		College College =em.find(College.class, id);
		return College;
	}

	@Override
	public void addCollege(College cg) {
		em.persist(cg);
		
	}

	@Override
	public void updateCollege(College cg) {
		em.merge(cg);
		
	}

	@Override
	public void removeCollege(College cg) {
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
