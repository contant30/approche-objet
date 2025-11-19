package tp.fichier;

public class Ville {

    private String nom;
    private String departement;
    private String nomRegion;
    private int population;

    public Ville(String nom, String departement, String nomRegion, int population) {
        this.nom = nom;
        this.departement = departement;
        this.nomRegion = nomRegion;
        this.population = population;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", departement=" + departement +
                ", nomRegion='" + nomRegion + '\'' +
                ", population=" + population +
                '}';
    }
}
