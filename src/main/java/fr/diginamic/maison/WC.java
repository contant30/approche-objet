package fr.diginamic.maison;

public class WC extends Piece{


    // Constructeur
    public WC(double superficie, int numEtage) {
        super(superficie, numEtage); // Appel du constructeur de la classe mère
    }

    @Override
    public String getType() {
        return "WC";
    }
}
