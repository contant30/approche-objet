package fr.diginamic.essais;

import fr.diginamic.Operation.CalculMoyenne;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestMoyenne {
    public static void main(String[] args){


        // Premier test
        CalculMoyenne cm1 = new CalculMoyenne();
        cm1.ajout(165);
        cm1.ajout(28);
        cm1.ajout(78);
        cm1.ajout(45);
        cm1.ajout(54);
        System.out.println("Moyenne du test 1 : " + cm1.calcul());

        // Deuxième test
        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(52);
        cm2.ajout(155);
        cm2.ajout(52);
        cm2.ajout(157);
        cm2.ajout(7);
        cm2.ajout(154);
        System.out.println("Moyenne test 2 : " + cm2.calcul());
    }

    public static class TestBanque {
        public static void main(String[] args){

            // Ajout information dans le compte cpt1
            Compte cpt1= new Compte( 120, 1236.15);

            // Ajout information d'un compte avec Taux
            CompteTaux cptT1= new CompteTaux(125,1258,3.52);


            // Création d'un tableau
            Compte[] tabComptes = {cpt1,cptT1};

            //Demande d'afficher le compte cpt1
            System.out.println(cpt1);
            System.out.println(cptT1);


            // Boucle pour afficher les comptes
            for (int i = 0; i < tabComptes.length; i++) {
                System.out.println(tabComptes[i].toString());
            }
        }
    }
}