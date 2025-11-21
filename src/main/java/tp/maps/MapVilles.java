package tp.maps;

import tp.maps.ressources.Ville;

import java.util.HashMap;

public class MapVilles {
    static void main(String[] args) {


        HashMap<String, Ville> ville = new HashMap<>();

        ville.put("Nice",new Ville( "Nice", 343000));
        ville.put("Carcassonne",new Ville("Carcassonne", 47800));
        ville.put("Narbonne", new Ville("Narbonne", 53400));
        ville.put("Lyon", new Ville("Lyon", 484000));
        ville.put("Foix",new Ville("Foix", 9700));
        ville.put("Pau", new Ville("Pau", 77200));
        ville.put("Marseille",new Ville("Marseille", 850700));
        ville.put("Tarbes",new Ville("Tarbes", 40600));

        //System.out.println(ville);

//        String villeMini=null
//
//        for (Ville v : ville.values()){
//            System.out.println(ville.values());
//        }


    }
    }
