package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.Arrays;

public class TestBanque {
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
