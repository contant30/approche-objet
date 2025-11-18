package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique{

    int longueur;
    int largeur;

    // Constructeur
    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }
}
