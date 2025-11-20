package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Top10VillesParDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {


        // On demande a l'utilisateur de choisir un numéro de département
            System.out.println("Veuillez rentrer un numéro de département");
            // On stocke sa valeur dans la variable departementChoisi
            String departementChoisi = scanner.nextLine();

            //Boucle pour parcourir toutes les villes dans le recensement
            List<Ville> villesDuDepartement = new ArrayList<>();
            for (Ville v : recensement.getVilles()) {
                if (v.getCodeDepartement().equals(departementChoisi)) {
                    villesDuDepartement.add(v);
                }
            }
               //Si aucune comparaison n'est trouvé
            if (villesDuDepartement.isEmpty()) {
                System.out.println("Aucune ville trouvée pour ce département.");
                return;
            }

        villesDuDepartement.sort((v1, v2) -> v2.getPopulation() - v1.getPopulation());

        // Afficher les 10 villes les plus peuplées
        System.out.println("Les 10 villes les plus peuplées du département " + departementChoisi + " :");
        for (int i = 0; i < 10 && i < villesDuDepartement.size(); i++) {
            Ville v = villesDuDepartement.get(i);
            System.out.println((i + 1) + ". " + v.getNomCommune()+ " : " +
                    String.format("%,d", v.getPopulation()).replace(',', ' ') + " habitants");
        }
    }
}