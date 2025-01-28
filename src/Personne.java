
public  class Personne {
	private String nom;
	private String prenom;
	
	public Personne(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		return "Personne[Prénom="+this.prenom+" Nom="+this.nom+']';
	}
}