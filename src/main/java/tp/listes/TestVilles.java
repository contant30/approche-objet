package tp.listes;

import java.util.ArrayList;
public class TestVilles {

    static void main(String[] args) {



    ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        System.out.println(villes);
        System.out.println(villes.size());


        Ville villePlusPeuplee = villes.get(0);
        Ville villeMoinsPeuplee= villes.get(0);


        for (Ville ville : villes){
            if (ville.getPop()>villePlusPeuplee.getPop()){
                villePlusPeuplee= ville;
            }
            if (ville.getPop()< villeMoinsPeuplee.getPop()){
                villeMoinsPeuplee= ville;
            }
            if (ville.getPop()>100_000){
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println(villePlusPeuplee);
        System.out.println(villeMoinsPeuplee);


        // Suppresion ville moins peuplée

        villes.remove(villeMoinsPeuplee);

        System.out.println(villes);
        System.out.println(villes.size());
    }
}
