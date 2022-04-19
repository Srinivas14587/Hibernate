package tnsif.c2tc.b09;

import tnsif.c2tc.b09.Service.MallService;
import tnsif.c2tc.b09.Service.MallServiceImpl;
import tnsif.c2tc.b09.entity.Mall;

public class Client {

	public static void main(String[] args) {
		MallService service= new MallServiceImpl();
		Mall M=new Mall();
		M.setId(917090378);
        M.setLocation("MG road");
        M.setMallName("garuda mall");
        //service.addMall(M);
        service.updateMall(M);
    //  System.out.print(service.searchMall(917090378));
       
    		
	}

}
