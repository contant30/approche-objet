package fr.diginamic.banque.entites;

public class Compte {

    // Encapsulation des varriables
    private int numeroCompte;
    private double soldeCompte;


    // Constructeur de numéroCompte et soldeCompte
    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    // toString pour faire un affichage lors du System.out.println
    @Override
    public String toString() {
        return "numeroCompte=" + numeroCompte +", soldeCompte=" + soldeCompte;
    }

    // Methode

    //Get qui permet de retourner la valeur de la variable numeroCompte sans la modifier
    public int getNumeroCompte() {
        return numeroCompte;
    }

    //Get qui permet de retourner la valeur de la variable soldeCompte sans la modifier
    public double getSoldeCompte() {
        return soldeCompte;
    }

    //Set pour modifier la variable numeroCompte
    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    //Set pour modifier la variable SoldeCompte
    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }




}
