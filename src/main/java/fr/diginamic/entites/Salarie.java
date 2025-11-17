package fr.diginamic.entites;

public class Salarie {

    String nom;
    String prenom;
    Double salaire;


    public Salarie(String nom, String prenom, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Double getSalaire() {
        return salaire;
    }


}
