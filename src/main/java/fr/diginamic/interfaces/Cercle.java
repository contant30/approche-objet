package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique{

    double rayon;

    // Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }


}
