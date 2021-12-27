import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;   
import java.util.Locale;   
import java.util.Calendar;   
import java.util.GregorianCalendar; 
import java.util.*;

import java.util.Collection;
import java.util.Collections;

public class TestClasseGenerique {

	public static void main(String[] args) {
		System.out.println(" ------String Et Personne------------------");
		//Apres Modification Classe Personne Ajout Age et Prenom
		
		Paire<String,Personne> AA= new Paire<String,Personne>("bonjour",new Personne(14,"Patricia","Dupont"));
		Paire<String,Personne> A2= new Paire<String,Personne>("Salut",new Personne(15,"Dupont","lienn"));
		Paire<String,Personne> A3= new Paire<String,Personne>("bonsoir",new Personne(12,"Jean","Jack"));
		Paire<String,Personne> A4= new Paire<String,Personne>("Aurevoir",new Personne(11,"Daniel","Bertrand"));
		String valu1=AA.getPaire1()+" "+A2.getPaire1()+" "+A3.getPaire1();
		Collection<Paire<String,Personne>> A= new ArrayList<Paire<String,Personne>>();
		A.add(AA);
		A.add(A2);
		A.add(A3);
		A.add(A4);
		
		System.out.println("Voici ArrayList est :"+A);
		System.out.println(AA.getPaire2().getNom()+" "+A2.getPaire2().getNom()+" "+A3.getPaire2().getNom());
	
		System.out.println(AA.toString());
		System.out.println(" ------Integer et String------------------");
		Paire<String,Integer> P1= new Paire<String,Integer>("bonjour",1 );
		String value=P1.getPaire1();
		Integer value2=P1.getPaire2();
		
		System.out.println(P1.getPaire1());
		System.out.println(P1.getPaire2());
		
		System.out.println(P1.toString());	  
		System.out.println(P1.toString());
		

}
}