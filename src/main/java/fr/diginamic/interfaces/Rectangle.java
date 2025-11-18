package fr.diginamic.interfaces;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return longueur == rectangle.longueur && largeur == rectangle.largeur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longueur, largeur);
    }
}
