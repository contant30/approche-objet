package fr.diginamic.maison;

public class Cuisine extends Piece{


    // Constructeur
    public Cuisine(double superficie, int numEtage) {
        super(superficie, numEtage); // Appel du constructeur de la classe mère
    }

    @Override
    public String getType() {
        return "Cuisine";
    }
}
