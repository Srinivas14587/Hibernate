package tnsif.c2tc.b09.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	static EntityManager entityManager;
    static EntityManagerFactory entityManagerFactory;

   static{
	   entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	   entityManagerFactory.createEntityManager();  
   }
   public static EntityManager getEntityManager()
   {
	   entityManager = entityManagerFactory.createEntityManager();
	   return entityManager;
   }
}



