package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args){

        Salarie sal1 = new Salarie("Romain", "contant",123);
        System.out.println("Le salaire du samarie est de : " + sal1.getSalaire()+" euro");

        Pigiste pig1= new Pigiste("Pierre","Pierre",14,10.5);
        System.out.println("Le salaire du pigiste est de : "+pig1.getSalaire()+" euro");

        pig1.afficherDonnes();
        sal1.afficherDonnes();
    }
}
