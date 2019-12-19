package Junit.ex0;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
		@Test
		public final void testDivide() {} 
		//TODO

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
			if (calc.substract(a,b) != res) {
				fail("a=0 et b positif");
		        }
		}
		
		@Test
		public final void testMultiply() {}
		// TODO
		

}
