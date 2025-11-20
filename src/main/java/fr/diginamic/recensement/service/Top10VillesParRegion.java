package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Top10VillesParRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        // On demande a l'utilisateur de choisir une région
        System.out.println("Veuillez rentrer une région");
        // On stocke sa valeur dans la variable régionChoisi
        String regionChoisi = scanner.nextLine();

        //Boucle pour parcourir toutes les villes dans le recensement
        List<Ville> villesRegion = new ArrayList<>();
        for (Ville v : recensement.getVilles()) {
            if (v.getNomRegion().equals(regionChoisi)) {
                villesRegion.add(v);
            }
        }
        //Si aucune comparaison n'est trouvé
        if (villesRegion.isEmpty()) {
            System.out.println("Aucune ville trouvée pour cette region.");
            return;
        }

        villesRegion.sort((v1, v2) -> v2.getPopulation() - v1.getPopulation());

        // Afficher les 10 villes les plus peuplées
        System.out.println("Les 10 villes les plus peuplées du département " + regionChoisi + " :");
        for (int i = 0; i < 10 && i < villesRegion.size(); i++) {
            Ville v = villesRegion.get(i);
            System.out.println((i + 1) + ". " + v.getNomCommune()+ " : " +
                    String.format("%,d", v.getPopulation()).replace(',', ' ') + " habitants");
        }
    }
}
