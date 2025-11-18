package tp.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    static void main(String[] args) {

        List<String> liste1 = new ArrayList<String>();
            liste1.add("Rouge");
            liste1.add("Vert");
            liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
            liste2.add("Blanc");
            liste2.add("Bleu");
            liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();

        for (String list: liste1){
            liste3.add(list);
        }
        for (String list: liste2){
            liste3.add(list);
        }

        System.out.println(liste1);
        System.out.println(liste2);
        System.out.println(liste3);











    }
}
