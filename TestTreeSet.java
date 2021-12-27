import java.util.*;
	public class TestTreeSet {
	 
		public static void main(String[] args) {
			int NbAleatoire=(int)( Math.random()*1000);
			TreeSet<Integer> set = new TreeSet<Integer>();
	    	for (NbAleatoire =0; NbAleatoire <=9; NbAleatoire++) {
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	System.out.println(set);}
	    	
	        Iterator itr = set.iterator();
	        while (itr.hasNext()) {
	        	//System.out.print(set);
	        	
	        	System.out.print(itr.next());	  
	        }
	    		    
	        }}


