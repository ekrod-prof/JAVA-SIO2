package POO;

public class MaClasse2 
{
	public int a_public; //accessible partout
	private int b_private; // accessible seulement ICI dans cette classe
	protected int c_protected;//accessible ICI et dans les classes fille et au sein du package.
	static int nbr_objet_instancié;//une variable static n'est pas attache à un objet
								   //cette variable est attachée à la classe elle vaut la meme valeur 
								   //quelque soit l'objet et elle est heritée.
			int z;//variable definie sans portée est dite friendly accessible au niveau package.
	
	// constructeur
	public MaClasse2()
	{
		this.a_public=10;
		this.a_public=20;
		this.c_protected=30;
		this.z=33;
		nbr_objet_instancié =nbr_objet_instancié +1;
	}
	//methode
	int met_private()
	{
		this.b_private=22;
		return this.b_private;
	}
	
}
