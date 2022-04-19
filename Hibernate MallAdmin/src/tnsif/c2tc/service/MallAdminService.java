package tnsif.c2tc.service;

import tnsif.c2tc.b09.entity.MallAdmin;

public interface MallAdminService {

	
	//void addAdmin(MallAdmin MA);

	 void updateAdmin(MallAdmin MA);

	//MallAdmin getAdmin(long id);

	MallAdmin getMallAdmin(long id);

	void deleteMallAdmin(long id);

	void addMallAdmin(MallAdmin MA);
}
