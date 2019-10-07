package animal;

public class Cage 
{
//On surcharge acceuillir
	public void acceuillir(Lion a)
	{
	System.out.println(a.getNom()+" est en cage");
	}
	
	public void acceuillir(Singe a)
	{
	System.out.println(a.getNom()+" est en cage");
	}
	
//ou on fait du polymorphisme
	//public void acceuillir(Animal a)
	//{
	//System.out.println(a.getNom()+" est en cage");
	//}

}
