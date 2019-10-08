package junit.ex1;

public class CalculatorImpl implements Calculator{
	//constructeur
	CalculatorImpl(){};
	@Override
	public int multiply(int a, int b) 
	{
		int res=0;int a1=0;int b1=0;
		if (a==0 | b==0) {res=0;}
		else 
			{			
				if (a<0) {a1=-a;}
				else {a1=a;}
				if (b<0) {b1=-b;}
				else {b1=b;}
				
							
				while (b1>0) 
				{
					res=res+add(a1,0);
					b1--;
				}
				//if (a>0 && b>0) {return res=res;}
				//if (a<0 | b<0) {return res=res;}
				if ((a>0 && b<0) | (a<0 && b>0)) {res=res*(-1);}
			
			}
		return res;	
	}
	
	@Override
	public int divide(int a, int b)
	{
		int res=0;int a1=0;int b1=0;int i=0;
		if (b==0) 
		{
			System.out.println("Erreur Division par zero.");
			res=010101;
		}
		if (a==0 && b!=0) {res=0;}
		if (a<0) {a1=-a;}
		else {a1=a;}
		if (b<0) {b1=-b;}
		else {b1=b;}
		//System.out.println("a1"+a1+"  b1 "+b1);
		for (i=1;i<=a1;i++)
		{
			if (multiply(i,b1)>=a1)
			{
				if (multiply(i,b1)>a1)	
				{
					i=i-1;
					res=i;
					//res=a1+"="+i+"x"+b1+substract(a1,multiply(i,b1));
					System.out.println("** "+i+" "+a1/b1);
					break;
				}
				else
				{
					res=i;
					//res=a1+"="+i+"x"+b1+substract(a1,multiply(i,b1));
					System.out.println("zz "+i+" "+a1/b1);
					break;
				}
			}
			System.out.println("for "+i+" "+a1/b1);
		} //end for
		if ((a>0 && b<0) | (a<0 && b>0)) {res=res*(-1);}
	System.out.println("ppp "+i+" res="+res+"  "+a1/b1);
	return res;
	}

	@Override
	public int add(int a, int b) {
		int res = a;
		if (b > 0) {
			while(b-- != 0) {
	                        res++;
	                }
	        }
		else if (b < 0) {
			while(b++ != 0) {
	                        res--;
	                }
	        }
		return res;
	}
	@Override
	public int substract(int a, int b) {
		int res = a;
		if (b > 0) {
			while(b-- != 0) {
	                        res--;
	                }
	        }
		else if (b < 0) {
			while(b++ != 0) {
	                        res++;
	                }
	        }
		return res;
	}

}
