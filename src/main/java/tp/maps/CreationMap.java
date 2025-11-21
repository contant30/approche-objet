package tp.maps;

import tp.maps.ressources.Employes;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    static void main(String[] args) {

        // Création des employés
        Employes emp1 = new Employes("Paul ",1750 );
        Employes emp2 = new Employes("Hicham ",1825 );
        Employes emp3 = new Employes("Yu ",2250 );
        Employes emp4 = new Employes("Ingrid ",2015 );
        Employes emp5 = new Employes("Chantal ",2418 );



        // Création d'une Map, la cle est de valeur String
        Map<String, Employes> mapUser = new HashMap<>();

        //ajout des valeurs dans la map
        mapUser.put("Paul",emp1);
        mapUser.put("Hicham",emp2);
        mapUser.put("Yu",emp3);
        mapUser.put("Ingrid", emp4);
        mapUser.put("Chantal",emp5);

        System.out.println("La taille de la map est de : "+mapUser.size());

    }
}
