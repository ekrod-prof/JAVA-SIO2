package ADN;
import java.util.*;
public class Base {
	ArrayList res=new ArrayList();
	int base;
	int nbr;
	private String vnbr;
	//constructeur
		Base()
		{
			this.base=0;
			this.nbr=0;
			
		}
	
	//constructeur
	Base(int vnbr, int vbase)
	{
		
		this.base=vbase;
		this.nbr=vnbr;
		this.traite(vnbr,vbase);
		
	}
	public ArrayList getRes() {
		this.afficheResultat();
		return res;
	}
	public void setRes(ArrayList res) {
		this.res = res;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
		this.res.clear();
		this.traite(nbr,base);
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
		this.res.clear();
		this.traite(nbr,base);
	}
	
	
	public int plusgrandePuissance(int vnbr, int vbase)
	{
		if (vbase==0) {return -1;}
		if (vbase==1) {return -1;}
		
		int i=0;
		int res=0;
		
	    boolean cond=true;
	    //System.out.println("zz"+vnbr+" "+vbase);
	    while (cond)
	    {
	    	if ((int)Math.pow(vbase,i) > vnbr)
			{
	    		cond=false;
				res=i-1;
				break;
			}
	     i=i+1;     
	    }
	    return res;
	} 
	
	
	    public void afficheTableau( ArrayList tab)
	    {
	    	int i=0;
	    	System.out.println("Affichage 1 valeur");
	    	for (i=0;i<tab.size();i++)
	    	{
	    		System.out.print(tab.get(i));
	    	}
	    	System.out.println("");
	    	System.out.println("Affichage 2 Tableau indice,valeur");
	    	for (i=0;i<tab.size();i++)
	    	{
	    		System.out.print(i+","+tab.get(i)+"  ");
	    	}
	    }
	    
	    
	    
	    public void afficheResultat()
	    {
	    	int i=0;
	    	System.out.print(this.nbr+" s'ecrit en base "+this.base+": ");
	    	for (i=0;i<this.res.size();i++)
	    	{
	    		System.out.print(this.res.get(i));
	    	}
	    	System.out.println("");
	    	
	    }
	    
	    
	    public void traite(int vnbr, int vbase) //base 10 vers base vbase.vbnr en base 10.
	    {
	    
	    	int reste=1;
	    	int i;
	    	int quotient;
	    	int puiss;
	    	puiss=this.plusgrandePuissance(vnbr, vbase);
	    	if (vnbr==0) {this.res.add(0);}
	    	for (i=puiss;i>=0;i--)
	    	{	
	    		puiss=i;
	    		quotient=vnbr/(int)Math.pow(vbase,puiss);
	    		reste=vnbr%(int)Math.pow(vbase,puiss);
	    		this.res.add(quotient);
	    		vnbr=reste;	
	    	}
	    }	
	    	
	    	
	    	

	      

}
