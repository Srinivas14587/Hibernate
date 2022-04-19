package tnsif.c2tc.b09.Dao;

import tnsif.c2tc.b09.entity.Mall;


public interface MallServiceDao {

	void addMall(Mall m);

	void getTransaction();

	void endTransaction();

	void updateMall(Mall M);
	
	//Mall getMall(long id);

	public  Mall searchMall(long id);


}
