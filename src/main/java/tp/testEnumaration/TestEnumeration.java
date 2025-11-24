package tp.testEnumaration;

import java.util.ArrayList;

public class TestEnumeration {
    public static void main(String[] args) {


        ArrayList<Saison> list = new ArrayList<>();
        list.add(Saison.PRINTEMPS);
        list.add(Saison.ETE);
        list.add(Saison.AUTOMNE);
        list.add(Saison.HIVER);



        String nom = "HIVER";
        Saison ete = Saison.valueOf(nom);
        System.out.println(ete.getNom());

        for (Saison s : list) {
            System.out.println(s);


            if (s != null) {
                System.out.println("Numéro : " + s.getNumero());
                System.out.println("Nom : " + s.getNom());
            } else {
                System.out.println("Saison inconnue !");
            }
        }

    }
}
