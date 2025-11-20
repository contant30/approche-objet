package fr.diginamic.recensement;

public class Departement  {

    private String codeDepartement;
    private int populationDepartement;


    public Departement(String codeDepartement, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.populationDepartement = populationDepartement;
    }

    // methode ajouter population
    public void ajouterPopulation(int pop){
        this.populationDepartement += pop;
    }

    // Getter
    public int getPopulationTotale() {
        return populationDepartement;
    }



}

