package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10Regions extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        // Creation d'une HashMap pour stocker les régions
        Map<String, Region> mapRegions = new HashMap<>();

        // On parcourt toutes les villes de recensement
        for (Ville v : recensement.getVilles()) {
            // on récupère le code region et le nom de la region
            String code = v.getCodeRegion();
            String nom = v.getNomRegion();
            Region region = mapRegions.get(code);

            // Si la regions n'existe pas dans la mapRegion on la cree
            if (region == null) {
                 region = new Region(code, nom);
                mapRegions.put(code, region);
            }
            // On ajoute la population à région
            region.ajouterPopulation(v.getPopulation());
        }

        // On transforme mapRegions en liste region
        List<Region> regions = new ArrayList<>(mapRegions.values());
        // Trie de la population
        regions.sort((r1, r2) -> r2.getPopulationTotale() - r1.getPopulationTotale());

        // Affiche les 10 regions les plus peuplé
        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < 10 && i < regions.size(); i++) {
            Region r = regions.get(i);
            System.out.println((i + 1) + ". " + r.getNomRegion() + " : "+ String.format("%,d", r.getPopulationTotale()).replace(',', ' ') + " habitants");
        }

    }
}
