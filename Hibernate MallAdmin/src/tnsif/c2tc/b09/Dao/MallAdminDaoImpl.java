package tnsif.c2tc.b09.Dao;


import javax.persistence.EntityManager;

import tnsif.c2tc.b09.entity.MallAdmin;

public class MallAdminDaoImpl implements MallAdminDao {
   EntityManager entityManager;
   public MallAdminDaoImpl() {
	   entityManager=Configuration.getEntityManager();
   }
	   
	@Override
	public void addMallAdmin(MallAdmin MA) {
		entityManager.persist(MA);
	}

	@Override
	public void getTranscation() {
	   entityManager.getTransaction().begin();	
	}

	@Override
	public void endTransaction() {
	  entityManager.getTransaction().commit();
		
	}

	@Override
	public void updateAdmin(MallAdmin MA) {
		entityManager.merge(MA);
	}

	@Override
	public MallAdmin getMallAdmin(long id) {
		MallAdmin MA=entityManager.find(MallAdmin.class, id);
		return MA;
	}

	@Override
	public void deleteMallAdmin(long id) {
		MallAdmin MA=entityManager.find(MallAdmin.class, id);
		entityManager.remove(MA);
	}
}
