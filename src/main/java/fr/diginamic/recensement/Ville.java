package fr.diginamic.recensement;

public class Ville {

    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int population;



    // Constructor
    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune,String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune= codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotale=" + population +
                '}';
    }

    // Getter
    public String getCodeRegion() {
        return codeRegion;
    }
    public String getNomRegion() {
        return nomRegion;
    }
    public String getCodeDepartement() {
        return codeDepartement;
    }
    public String getCodeCommune() {
        return codeCommune;
    }
    public String getNomCommune() {
        return nomCommune;
    }
    public int getPopulation() {
        return population;
    }
}
