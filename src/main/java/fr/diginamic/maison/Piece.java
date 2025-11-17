package fr.diginamic.maison;

public abstract class Piece {

    // Attributs
    double superficie;
    int numEtage;


    // Constructeur
    public Piece(double superficie, int numEtage) {
        this.superficie = superficie;
        this.numEtage = numEtage;
    }

    // Methode GET
    public double getSuperficie() {
        return superficie;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public abstract String getType();
}
