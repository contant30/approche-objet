package tp.maps.ressources;

public class Pays {

    String nom;
    int nombreHabitant;
    String nomContinent;

    public Pays(String nom, int nombreHabitant, String nomContinent) {
        this.nom = nom;
        this.nombreHabitant = nombreHabitant;
        this.nomContinent = nomContinent;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreHabitant() {
        return nombreHabitant;
    }

    public String getNomContinent() {
        return nomContinent;
    }
}
