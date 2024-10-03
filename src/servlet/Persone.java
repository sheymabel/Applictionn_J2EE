package servlet;

public class Persone {
	 private String nom;
	    private String prenom;
	    private String telephone;
	    private String ville;
	    private String produits;

	    public Persone(String nom, String prenom, String telephone, String ville, String produits) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.telephone = telephone;
	        this.ville = ville;
	        this.produits = produits;
	    }
	    public Persone() {
	       
	    }

	    // Getters et Setters
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

	    public String getTelephone() {
	        return telephone;
	    }

	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }

	    public String getVille() {
	        return ville;
	    }

	    public void setVille(String ville) {
	        this.ville = ville;
	    }

	    public String getProduits() {
	        return produits;
	    }

	    public void setProduits(String produits) {
	        this.produits = produits;
	    }

	  
	    @Override
	    public String toString() {
	        return "Client [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", ville=" + ville
	                + ", produits=" + produits + "]";
	    }
}
