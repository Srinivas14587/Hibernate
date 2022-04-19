package tnsif.c2tc.service;

import tnsif.c2tc.b09.Dao.MallAdminDao;
import tnsif.c2tc.b09.Dao.MallAdminDaoImpl;
import tnsif.c2tc.b09.entity.MallAdmin;

public class MallAdminServiceImpl implements MallAdminService {
MallAdminDao MD;
public MallAdminServiceImpl() {
	MD=new MallAdminDaoImpl();
}
	@Override
	public void addMallAdmin(MallAdmin MA) {
		MD.getTranscation();
		MD.addMallAdmin(MA);
		MD.endTransaction();	
	}
	@Override
	public void updateAdmin(MallAdmin MA) {
		MD.getTranscation();
		MD.updateAdmin(MA);
		MD.endTransaction();
	}
	
	@Override
	public MallAdmin getMallAdmin(long id) {
		 MallAdmin MA=MD.getMallAdmin(id);
		return MA;
	
	}
	@Override
	public void deleteMallAdmin(long id) 
	{
		MD.getTranscation();
		MD.deleteMallAdmin(id);
		MD.endTransaction();	
	}
	

}
