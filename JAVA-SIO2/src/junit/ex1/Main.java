package junit.ex1;

public class Main {
	
	public static void main(String[] args) 
{
		//tester une chaine de caractere
		String var1 = new String("TATA");
		String var2 = new String("TATA");
		boolean result = (var1==var2);
		System.out.println("== result: "+result);
		
		result =var1.equals(var2);
		System.out.println(" equals() result: "+result);
		
		result =("TATA".equals(var1));
		System.out.println("test TATA result: "+result);
		result =("TOTO".equals(var1));
		System.out.println("test TOTO result: "+result);

}

}
