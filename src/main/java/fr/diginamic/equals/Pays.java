package fr.diginamic.equals;

import java.util.Objects;

public class Pays {

    String pays;
    int population;


    public Pays(String pays, int population) {
        this.pays = pays;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Pays pays = (Pays) o;
        return population == pays.population;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(population);
    }

    public String getPays() {
        return pays;
    }

    public int getPopulation() {
        return population;
    }
}
