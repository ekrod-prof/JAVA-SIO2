package Junit.ex0;

public class CalculatorImpl implements Calculator{
	//constructeur
	CalculatorImpl(){};
	@Override
	public int multiply(int a, int b) {return 0;};
	
	@Override
	public int divide(int a, int b){return 0;};
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}

}
