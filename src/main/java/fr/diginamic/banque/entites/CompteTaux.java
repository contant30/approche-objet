package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double tauxRemu;


    //Constructeur avec les infos parents
    public CompteTaux(int numeroCompte, double soldeCompte,double tauxRemu){
        super(numeroCompte,soldeCompte);
        this.tauxRemu = tauxRemu;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"le taux de rémunération est de " + tauxRemu;
    }

    public double getTauxRemu() {
        return tauxRemu;
    }

    public void setTauxRemu(double tauxRemu) {
        this.tauxRemu = tauxRemu;
    }
}
