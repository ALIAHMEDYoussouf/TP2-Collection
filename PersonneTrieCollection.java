import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PersonneTrieCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne P1=new Personne(10,"ALI","Francois");
		Personne P2=new Personne(10,"ALI","Ila");
		Personne P3=new Personne(16,"ALI","Marck");
		Personne P4=new Personne(22,"Cecile","Paul");
		Personne P5=new Personne(23,"Clement","Dupont");
		ArrayList<Personne> personnes = new ArrayList<>();
		personnes.add(P1);
		personnes.add(P2);
		personnes.add(P3);
		personnes.add(P4);
		personnes.add(P5);
		
		Collections.sort(personnes);
		System.out.println("-----------Apres Trie  D'Age si meme age voir Nom si meme nom voir Prenom--------------" );
		System.out.println(personnes);
	}

}
