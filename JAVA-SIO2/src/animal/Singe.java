package animal;

public class Singe extends Animal{
	// A NE SURTOUT PAS FAIRE:ENCAPSULATION
	public String nom;
	// A NE SURTOUT PAS FAIRE:ENCAPSULATION
	
	
	//constructeur par defaut
	Singe() 
	{
		System.out.println("const par defaut du Singe");
		this.nom="par defaut Singe";
	}
	
	//constructeur surchargé.
		
	public Singe(String a)
		
	{
			
		System.out.println("constructeur surchargé Singe");
		this.nom=a;	
	}
	
	//methode REDEFINIE et non SURCHARGEE la signature est la même
	//que celle de la classe Animal
	
	String getNom() { System.out.println("getNom de Singe"); return this.nom; }
	
	
}
