package animal;

public class Lion extends Animal 
{
	// A NE SURTOUT PAS FAIRE:ENCAPSULATION
	public String nom;
	// A NE SURTOUT PAS FAIRE:ENCAPSULATION
	
	//constructeur par defaut
	public Lion()
	{
		this.nom="par defaut Lion";
		System.out.println("const par defaut Lion");
	}
	
	//constructeur surchargé.
	public Lion(String a)
	{
		System.out.println("constructeur surchargé lion");
	this.nom=a;	
	}
	
	//methode REDEFINIE et non SURCHARGEE la signature est la même
	//que celle de la classe Animal
	
	 String getNom() { System.out.println("getNom de Lion");
	return this.nom; }
	 

}
