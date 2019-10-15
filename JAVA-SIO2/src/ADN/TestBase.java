package ADN;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class TestBase {
	
	@Test
	void test_traite()
	{
		Base obj=new Base();
		ArrayList res_attendu = new ArrayList();
		
		
		obj.traite(500,4);
		res_attendu.add(1);res_attendu.add(3);res_attendu.add(3);res_attendu.add(1);res_attendu.add(0);
		if (!(res_attendu.equals(obj.getRes())))
		{fail("Erreur traite() 500 base 4");}
		
		
		obj.traite(17,4);
		res_attendu.add(1);res_attendu.add(0);res_attendu.add(1);
		if (!(res_attendu.equals(obj.getRes())))
		{fail("Erreur traite() 17 base 4");}
	
		
		obj.traite(0,4);
		res_attendu.add(0);
		if (!(res_attendu.equals(obj.getRes())))
		{fail("Erreur traite() 0 base 4");}
		
		obj.traite(17,2);
		res_attendu.add(1);res_attendu.add(0);res_attendu.add(0);res_attendu.add(0);res_attendu.add(1);
		if (!(res_attendu.equals(obj.getRes())))
		{fail("Erreur traite() 0 base 4");}
	
	

	}
	
	@Test
	void test_plusgrandePuissance()
	{
		Base obj=new Base();
		int res_attendu;
		res_attendu=3;
		if (obj.plusgrandePuissance(10,2 )!=res_attendu)
		{fail("Erreur plusgrandePuissance(10,2) ");}
		
		res_attendu=10;
		if (obj.plusgrandePuissance(1256,2 )!=res_attendu)
		{fail("Erreur plusgrandePuissance(10,2) ");}
				
		
	
	
	

	}
}
