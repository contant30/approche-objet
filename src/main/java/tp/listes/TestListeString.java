package tp.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<String>();
        Collections.addAll(villes,"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes" );

        System.out.println(villes);

        // Recherche de la ville avec le plus de lettre
        // Initialisation
        String villePlusLongue= "";
        // Parcour du tableau
        for (String mot: villes){
            // Si la longueur du mot et plus grand que villepluslongue
            if (mot.length()> villePlusLongue.length()){
                villePlusLongue = mot;
            }
        }
        System.out.println(villePlusLongue);


        // On modifie les villes en majuscule
        // on parcoure le tableau
        for (int i = 0; i < villes.size(); i++){

            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println(villes);

        // On enleve les villes qui commence par N
        Iterator<String> iter = villes.iterator();
        while (iter.hasNext()){
            String ville = iter.next();
                if (ville.startsWith("N")){
                    iter.remove();
                }
        }
        System.out.println(villes);

    }
}
