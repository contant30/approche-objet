package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int nbPersonne; // capacité max
    private int clientInscrits;
    private double recette;

    //Constructeur
    public Theatre(String nom, int nbPersonne) {
        this.nom = nom;
        this.nbPersonne = nbPersonne; // capacité max
        this.clientInscrits = clientInscrits;
        this.recette = recette;
    }

    // Methode pour inscrire
    public void inscrire(int nbClients, double prixPlace){

            // on vérifie que la saisie ne comporte pas d'erreur
            if (nbClients <= 0 || prixPlace < 0) {
            System.out.println("Erreur : nombre de clients ou prix invalide");
            return;
            }

            // on vérifie qu'il reste des places dans le theatre
            if( clientInscrits + nbClients > nbPersonne ){
                System.out.println("Erreur : Capacité du théatre atteinte ");


            } else {
                clientInscrits += nbClients;               // Ajout des clients
                recette += nbClients * prixPlace;  // Calcul de la recette
                System.out.println(nbClients + " clients inscrits. Recette calculé : " + (nbClients * prixPlace) + " €");
            }
        }

    @Override
    public String toString() {
        return  nom;
    }


    // Methode Get pour accéder aux valeurs des attributs depuis d'autre classes

    public String getNom() {
        return nom;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public int getClientInscrits() {
        return clientInscrits;
    }

    public double getRecette() {
        return recette;
    }
}


