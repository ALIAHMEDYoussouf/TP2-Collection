import java.util.*;
import java.util.Iterator;
public class CollectionTrie {
	
	    public static void main(String[] args)  {    	     	
	    	
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	int NbAleatoire=(int)( Math.random()*1000);
	    	for (NbAleatoire = 0;  NbAleatoire<=5;  NbAleatoire++) {
	    	list.add(NbAleatoire);
	    	list.add(NbAleatoire);
	    	list.add(NbAleatoire);
	    	list.add(NbAleatoire);
	    	list.add(NbAleatoire);
	    	
	        Collections.sort(list);      
	        System.out.println("Trie est: "+ list);}
	    	System.out.println("---------------Avec Set-----------------------");
			TreeSet<Integer> set = new TreeSet<Integer>();
	    	for (NbAleatoire = 0; NbAleatoire <=5; NbAleatoire++) {
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	set.add(NbAleatoire);
	    	System.out.println("Trie avec Set est :"+set);}
	    	
	    	
	        Iterator itr = set.iterator();
	        while (itr.hasNext()) {
	        	//System.out.print(set);
	        	
	        	System.out.print(itr.next());
	        }
	    	
	    	
	    }
}
	


