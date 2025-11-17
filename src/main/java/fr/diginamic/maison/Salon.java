package fr.diginamic.maison;

public class Salon extends Piece{


    // Constructeur
    public Salon(double superficie, int numEtage) {
        super(superficie, numEtage); // Appel du constructeur de la classe mère
    }

    @Override
    public String getType() {
        return "Salon";
    }
}
