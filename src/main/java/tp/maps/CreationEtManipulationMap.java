package tp.maps;

import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulationMap {
    static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(30, "Bordeaux" );

        for( Integer map : mapVilles.keySet()){
        System.out.println(map);}

        for (String mapValeur : mapVilles.values()){
            System.out.println(mapValeur);
        }

        System.out.println(mapVilles.size());

    }
}
