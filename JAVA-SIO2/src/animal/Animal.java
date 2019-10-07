package animal;

public class Animal {
	public String nom;
	//constructeur surcharge
	Animal(String a)
	{
		this.nom=a;
	}
	//construteur par defaut
	Animal()
	{
		System.out.println("constructeur de animal");
		this.nom="Animal";
	}
	//methode
	String getNom()
	{
		System.out.println("appel getNom de Animal");
		return this.nom;
	}
	

}
