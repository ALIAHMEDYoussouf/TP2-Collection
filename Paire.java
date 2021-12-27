import java.util.*;
public class Paire<U,V> {	
	private U Paire1;
	private  V Paire2;
	
	public Paire (U Paire1,V Paire2) {
		this.Paire1=Paire1;
		this.Paire2=Paire2;
	}
	public U getPaire1() {
		return Paire1;
	}

	public V getPaire2() {
		return Paire2;
	}

	public void setPaire1(U Paire1) {
		this.Paire1 =Paire1 ;
	}
	public void setPaire2(V Paire2) {
		this.Paire2 =Paire2 ;
	}
	@Override
	public String toString() {
	    return "chaine de Caractere est: "+Paire1 + " Personne est: " + Paire2;
	  }

	



	
	



	
	
	
}