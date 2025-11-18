package tp.listes;

import java.util.ArrayList;

public class CreationListe {
    static void main(String[] args) {

        // Création du tableau
        ArrayList<Integer> list = new ArrayList<>();

        // Boucle pour ajouter les nombres de 1 à 100
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(" la taille de la liste est de : "+list.size());

    }
}
