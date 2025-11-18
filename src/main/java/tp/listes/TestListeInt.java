package tp.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, -1, 5, 7, 3, -2, 4, 8, 5);

        // Affiche les éléments de la liste.
        System.out.println(list);

        // Affiche le nombre d'élément de la liste.
        System.out.println(list.size());

        // On recherche le plus grand éléments
        int max = 0;
        for (Integer user : list) {
            if (user > max) {
                max = user;
            }
        }
        System.out.println(max);


        // Recherche du plus petit élément
        int min = list.get(0);
        for (Integer user : list) {
            if (user < min) {
                min = user;
            }
        }
        System.out.println(min);

        // Recherche des éléments négatif du tableau
        for (int i = 0; i < list.size();i++ ){
            if (list.get(i) <0){
                // met un - devant la valeur récupéré, - et - donne +
                list.set(i,-list.get(i));
            }
        }
        System.out.println(list);



        // On enleve la valeur de min
        list.remove(Integer.valueOf(min));

        System.out.println(list);
        }

    }

