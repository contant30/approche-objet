package tp.maps;

import tp.maps.ressources.Pays;

import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {
    static void main(String[] args) {

//                // Création de la ArrayList de Pays nommée listPays
//                ArrayList<Pays> listPays = new ArrayList<>();
//
//                listPays.add(new Pays("Allemagne", 80_000_000, "Europe"));
//                listPays.add(new Pays("Belgique", 10_000_000, "Europe"));
//                listPays.add(new Pays("Russie", 150_000_000, "Asie"));
//                listPays.add(new Pays("Chine", 1_400_000_000, "Asie"));
//                listPays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
//                listPays.add(new Pays("Australie", 20_000_000, "Océanie"));

                // HashMap pour compter les pays par continent
                Map<String, Pays> mapContinents = new HashMap<>();

                mapContinents.put("France",new Pays("France", 65_000_000, "Europe"));
                mapContinents.put("Allemagne",new Pays("Allemagne", 80_000_000, "Europe"));
                mapContinents.put("Belgique",new Pays("Belgique", 10_000_000, "Europe"));
                mapContinents.put("Chine",new Pays("Chine", 65_000_000, "Océanie"));
                mapContinents.put("Indonésie",new Pays("Indonésie", 65_000_000, "Asie"));
                mapContinents.put("Australie",new Pays("Australie", 65_000_000, "Europe"));


                HashMap<String, Integer> comptage = new HashMap<>();
                for (Pays v : mapContinents.values()) {

                    String continent = v.getNomContinent();
                    Integer compteur = comptage.getOrDefault(continent, 0);
                    compteur++;
                    comptage.put(continent,compteur);
                    }

                // Affichage
        System.out.println(comptage);
                }
            }
