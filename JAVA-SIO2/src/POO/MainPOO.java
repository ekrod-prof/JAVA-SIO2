package POO;

public class MainPOO {

	public static void main(String[] args) 
	{
		
		//encapsulation,constructeur.
		MaClasse obj = new MaClasse(66);
		System.out.println("ENCAPSULATION:utilisation du getter pour "
							+ "recuperer la valeur de var1  :"+obj.get_var1());
		System.out.println("appel de la méthode fois2: "+obj.fois2());
		obj.set_var1(100);
		System.out.println("ENCAPSULATION:utilisation du setter pour modifier obj.var1"+"\n"
				+"et du getter pour recuperer la valeur de var1 qui vaut:"+obj.get_var1());
		
		
	
		MaClasse2 objA=new MaClasse2();
		Fille002 obj_Fille=new Fille002();
		
	}

}
