package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.entity.Mall;


public interface MallService {

	void addMall(Mall M);

	void updateMall(Mall M);

//	Mall getMall(long id);
   
	public Mall searchMall(long id);
}
