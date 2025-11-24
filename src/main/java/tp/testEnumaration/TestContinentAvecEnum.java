package tp.testEnumaration;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    static void main(String[] args) {

        ArrayList <villeContinent> listVille = new ArrayList<>();

        listVille.add(new villeContinent("New York",5000,Continent.AMERIQUE));
        listVille.add(new villeContinent("Paris",456254,Continent.EUROPE));
        listVille.add(new villeContinent("Pékin",456254,Continent.ASIE));
        listVille.add(new villeContinent("Moscou",456254,Continent.ANTARCTIQUE));
        listVille.add(new villeContinent("Berlin",456254,Continent.EUROPE));
        listVille.add(new villeContinent("Sydney",456254,Continent.OCEANIE));
        listVille.add(new villeContinent("Dakar",456254,Continent.AFRIQUE));

        for (villeContinent l : listVille){
            System.out.println(l);
        }





    }
}
