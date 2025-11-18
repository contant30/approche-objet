package fr.diginamic.combat.entites;
import java.util.Scanner;

import static fr.diginamic.combat.entites.Combat.lancerCombat;

public class MenuJeu {

    private Personnage joueur;
    private Scanner sc = new Scanner(System.in);

    public void afficherMenu(){

        int choix;

        do {
            System.out.println("1 : Creer un personnage");
            System.out.println("2 : Combattre une créature");
            System.out.println("3 : Afficher le score");
            System.out.println("4 : Fuir");
            choix = sc.nextInt();

            switch (choix) {
                case 1 -> creerPersonnage();
                case 2 -> lancerCombat( );
                case 3 -> System.out.println("Au revoir !");
                default -> System.out.println("Option invalide!");
            }
        } while (choix!=4);
    }

    private void creerPersonnage() {
        System.out.print("Nom du personnage: ");
        String nom = sc.nextLine();

        int force = (int)(Math.random()*7 + 12);      // 12 à 18
        int pv = (int)(Math.random()*31 + 20);
        // 20 à 50
        joueur = new Personnage(nom, force, pv);

        System.out.println("Personnage créé: " + joueur);
    }


    }

}
