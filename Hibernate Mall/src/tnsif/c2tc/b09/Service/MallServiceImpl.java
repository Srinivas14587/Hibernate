package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.Dao.MallServiceDao;
import tnsif.c2tc.b09.Dao.MallServiceDaoImpl;
import tnsif.c2tc.b09.entity.Mall;

public class MallServiceImpl implements MallService {
    MallServiceDao MD;
    public MallServiceImpl() {
		MD=new MallServiceDaoImpl();
    }
	@Override
	public void addMall(Mall M) {
		MD.getTransaction();
		MD.addMall(M);
	    MD.endTransaction();	
	}
	@Override
	public void updateMall(Mall M) {
		MD.getTransaction();
		MD.updateMall(M);
	    MD.endTransaction();
		
	}
	
	@Override
	public Mall searchMall(long id) {
		Mall MA=MD.searchMall(id);
		return MA;
	}
	

}
