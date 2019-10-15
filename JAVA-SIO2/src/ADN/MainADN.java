package ADN;

import java.util.ArrayList;

public class MainADN {

	public static void main(String[] args) {
		int val=0;
//		Base obj=new Base(17,4);
//		ArrayList tabTest=new ArrayList();
//		tabTest.add(1);
//		tabTest.add(2);
//		tabTest.add(3);
//		System.out.println("eeeeeeeeeeeee"+ obj.plusgrandePuissance(17, 64));
//		obj.traite(val,4);
//		obj.afficheTableau(obj.res);
//		System.out.println("FIN");
//		System.out.println(obj.plusgrandePuissance(1256, 2));
		
		Base obj=new Base(114,4);
		obj.getRes();
		obj.setNbr(34520393);
		obj.setBase(2);
		obj.getRes();
	}

}
