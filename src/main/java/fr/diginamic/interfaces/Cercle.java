package fr.diginamic.interfaces;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cercle cercle = (Cercle) o;
        return Double.compare(rayon, cercle.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rayon);
    }
}
