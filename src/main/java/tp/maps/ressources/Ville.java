package tp.maps.ressources;

public class Ville {

    String nom;
    int population;

    public Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                '}';
    }
}
