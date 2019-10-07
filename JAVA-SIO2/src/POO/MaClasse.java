package POO;

public class MaClasse
	{
		//Cette classe  contient un parametre d'instance.
		private int var1;
			
		//constructeur1 :par defaut
		public MaClasse()
		{
			System.out.println(" print depuis le constructeur par defaut");
			this.var1=10;
		}
		//constructeur2:avec parametre
		public MaClasse(int a)
		{
			System.out.println("constructeur 2 avec passage de parametre");
			this.var1=a;
		}
		//getter
		public int get_var1() 
		{
			return this.var1;
		}
		//setter
		public void set_var1(int a)
		{
			this.var1=a;
		}
		//Un méthode 
		public int fois2() 
		{
			return this.var1*2;	
		}
	}		