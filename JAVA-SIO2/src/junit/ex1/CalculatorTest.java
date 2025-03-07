package junit.ex1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
		@Test
		public final void testDivide()
		{
			Calculator calc = new CalculatorImpl();
			int a, b, res;
			a = 25; 
		    b  = 3;
		    res = a/b;
			if (calc.divide(a,b) != res) 
			{
				fail("FAIL");
			}
			a = -25; 
		    b  = 3;
		    res = a/b;
			if (calc.divide(a,b) != res) 
			{
				fail("FAIL");
			}	
			a = 25; 
		    b  = -3;
		    res = a/b;
			if (calc.divide(a,b) != res) 
			{
				fail("FAIL");
			}	
			a = -25; 
		    b  = -3;
		    res = a/b;
			if (calc.divide(a,b) != res) 
			{
				fail("FAIL");
			}		
			a = 0; 
		    b  = -3;
		    res = a/b;
			if (calc.divide(a,b) != res) 
			{
				fail("FAIL");
			}	
		}
	
		@Test
		public final void testAdd() {
			Calculator calc = new CalculatorImpl();
			int a, b, res;
			a = 5; 
		    b  = 5;
		    res = a + b;
			if (calc.add(a,b) != res) {
				fail("a et b positif");
				//Assertions.fail("a et b positif");
				
		        }
		}

		@Test
		public final void testSubstract() {
			Calculator calc = new CalculatorImpl();
			int a, b, res;
			a = 5; 
		    b  = 5;
		    res = a - b;
			if (calc.substract(a,b) != res) {
				fail("a et b positif");
		        }
			a = 0; 
		    b  = 5;
		    res = a - b;
			if (calc.substract(a, b) != res) {
				fail("a=0 et b positif");
		        }
			a = 0; 
		    b  = -5;
		    res = a - b;
			if (calc.substract(a, b) != res) {
				fail("a=0 et b négatif");
		        }
			a = -5; 
		    b  = 0;
		    res = a - b;
			if (calc.substract(a,b) != res) {
				fail("a négatif et b=0");
		        }
			a = 0; 
		    b  = 0;
		    res = a - b;
			if (calc.substract(a, b) != res) {
				fail("a=0 et b=0");
		        }
			a = -5; 
		    b  = -5;
		    res = a - b;
			if (calc.substract(a,b) != res) {
				fail("a et b négatif");
		        }
			a = 10; 
		    b  = -5;
		    res = a - b;
			if (calc.substract(a,b) != res) {
				fail("a positif et b ,négatif");
		        }
			a = -10; 
		    b  = 5;
		    res = a - b;
			if (calc.substract(a,b) != res) {
				fail("a négatif et b positif");
		        }			
		}
		
		@Test
		public final void testMultiply() 
		{
			Calculator calc = new CalculatorImpl();
			int a, b, res;
			a = 5; 
		    b  = 5;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a et b positif");
			}
			
			
			a = -5; 
		    b  = 5;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a negatif et b positif");
			}
			a = 5; 
		    b  = -5;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a positif et b negatif");
			}
			
			a = 0; 
		    b  = 5;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a=0 et b positif");
			}
			a = 0; 
		    b  = -5;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a=0 et b negatif");
			}
			
			a = 5; 
		    b  = 0;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a positif et b=0");
			}
			a = -5; 
		    b  = 0;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a negatif et b=0");
			}
			
			a = 0; 
		    b  = 0;
		    res = a*b;
			if (calc.multiply(a,b) != res) 
			{
				fail("a=0 et b=0");
			}

		}
}
			
		
			
		
