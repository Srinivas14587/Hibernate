package tnsif.c2tc.b09;

import tnsif.c2tc.b09.entity.MallAdmin;
import tnsif.c2tc.service.MallAdminService;
import tnsif.c2tc.service.MallAdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		MallAdminService service= new MallAdminServiceImpl();
	
		MallAdmin MA= new MallAdmin();
		MA.setId(917090378770L);
		MA.setName("srinivas");
		MA.setPassword("Sa@12345678");
		MA.setPhone(7090378770L); 
	   service.addMallAdmin(MA);
	    service.updateAdmin(MA);
		//MallAdmin MA1=service.getMallAdmin(917090378770L);
	//	System.out.println(MA1);	
		//service.deleteMallAdmin(917090378770L);
	}
}



