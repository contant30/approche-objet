package fr.diginamic.maison;

public class Chambre extends Piece{


    // Constructeur
    public Chambre(double superficie, int numEtage) {
        super(superficie, numEtage); // Appel du constructeur de la classe mère
    }

    @Override
    public String getType() {
        return "Chambre";
    }
}
