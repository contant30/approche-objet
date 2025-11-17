package fr.diginamic.combat.entites;

public class Combat {
    public static boolean lancerCombat(Personnage joueur, Creature monstre){

        // Affichage du montre
        System.out.println("Vous êtes tomber sur un "+ monstre.getNom());

        // On boucle tant que joueur est en vie ou monstre est en vie
        while (joueur.enVie()&& monstre.enVie()) {

            // Création des attributs attaques
            int attaqueJoueur = joueur.attaque();
            int attaqueMonstre = monstre.attaquer();

            System.out.println(joueur.getNomPerso() + "attaque de " + attaqueJoueur);
            System.out.println(monstre.getNom() + "attaque de " + attaqueMonstre);

            //Si l attaque du joueur est supérieur à la créature
            if (attaqueJoueur > attaqueMonstre) {
                int degat = attaqueJoueur - attaqueMonstre;
                monstre.recevoirDegats(degat);
                System.out.println("Vous avez infligé au " + monstre.getNom() + " : " + degat);

                //Si l attaque de la créature est supérieur joueur
            } else if (attaqueJoueur < attaqueMonstre) {
                int degat = attaqueMonstre - attaqueJoueur;
                joueur.recevoirDegats(degat);
                System.out.println("Le monstre " + monstre.getNom() + " vous a inflige : " + degat);

            } else {
                System.out.println("égalité, aucun dégât reçu! ");
            }

            System.out.println(joueur);
            System.out.println(monstre);
            System.out.println("-----------------------");
        }
            return joueur.enVie();
        }
    }

