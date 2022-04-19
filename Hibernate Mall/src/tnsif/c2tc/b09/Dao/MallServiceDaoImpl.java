package tnsif.c2tc.b09.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.b09.entity.Mall;


public class MallServiceDaoImpl implements MallServiceDao {
   EntityManager entityManager;
   public MallServiceDaoImpl() {
	entityManager=Configuration.getEntityManager();
}
	@Override
	public void addMall(Mall M) {
		entityManager.persist(M);
	}
	@Override
	public void getTransaction() {
		entityManager.getTransaction().begin();
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}
	@Override
	public void updateMall(Mall M) {
		entityManager.merge(M);
	}
	
	@Override
	public Mall searchMall(long id) {
		Mall MA=entityManager.find(Mall.class, id);
		return MA;
	}
		
}

