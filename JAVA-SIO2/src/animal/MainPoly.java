package animal;

public class MainPoly 
{

	public static void main(String[] args) 
	{
		Singe singe1= new Singe("Cheeta");
		System.out.println("" );
		Lion lion1 = new Lion("Clarence");
		System.out.println("");
		Cage cage1 =new Cage();
		Cage cage2 =new Cage();
		cage1.acceuillir(lion1);
		System.out.println("");
		cage2.acceuillir(singe1);

	}

}
