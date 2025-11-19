package tp.listes;

import java.util.Objects;

public class Ville {

    private String nom;
    private int pop;

    public Ville(String nom, int pop) {
        this.nom = nom;
        this.pop = pop;
    }







    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return pop == ville.pop && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return 0;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public int getPop() {
        return pop;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
