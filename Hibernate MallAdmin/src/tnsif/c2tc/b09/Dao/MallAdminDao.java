package tnsif.c2tc.b09.Dao;

import tnsif.c2tc.b09.entity.MallAdmin;

public interface MallAdminDao {

	void addMallAdmin(MallAdmin MA);

	void getTranscation();

	void endTransaction();

	void updateAdmin(MallAdmin MA);

	//MallAdmin getAdmin(long id);

	MallAdmin getMallAdmin(long id);

	void deleteMallAdmin(long id);

}
