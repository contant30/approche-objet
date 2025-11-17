package fr.diginamic.maison;

public class SalleDeBain extends Piece{


    // Constructeur
    public SalleDeBain(double superficie, int numEtage) {
        super(superficie, numEtage); // Appel du constructeur de la classe mère
    }

    @Override
    public String getType() {
        return "SalleDeBain";
    }
}
