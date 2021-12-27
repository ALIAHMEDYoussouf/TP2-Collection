import java.util.*;
public class Personne implements Comparable<Personne>{
	private int age;
	private String nom;
	private String prenom;

	public Personne(int age,String nom,String prenom) {
		this.age=age;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne Age est :"+age+" son Non:"+ nom+ " et son prenon: " +prenom;
	}
	@Override
	/*public int compareTo(Personne autrePersonne) {
		int comparaisonNom=nom.compareTo(autrePersonne.getNom());
		if (comparaisonNom==0) {
			return prenom.compareTo(autrePersonne.getNom());
		}
		else
			return comparaisonNom;
}*/
	public int compareTo(Personne autrePersonne) {
			int ComparaisonAge= age-autrePersonne.getAge();
			int comparaisonNom=nom.compareTo(autrePersonne.getNom());
			if (ComparaisonAge==0) {
				return nom.compareTo(autrePersonne.getNom());
			}
			else if (comparaisonNom==0) {
				return prenom.compareTo(autrePersonne.getPrenom());
			}
			return ComparaisonAge;
			
	}}
