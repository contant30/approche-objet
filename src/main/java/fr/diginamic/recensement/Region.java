package fr.diginamic.recensement;

public class Region {

    private String codeRegion;
    private String nomRegion;
    private int populationRegion;

    public Region(String codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.populationRegion = populationRegion;
    }

    // methode pour ajouter des populations
    public void ajouterPopulation(int population){
        this.populationRegion += population;
    }

    // Getter
    public int getPopulationTotale() {
        return populationRegion;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }
}

