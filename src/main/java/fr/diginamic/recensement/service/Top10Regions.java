package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10Regions extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        Map<String, Region> mapRegions = new HashMap<>();

        for (Ville v : recensement.getVilles()) {
            String code = v.getCodeRegion();
            String nom = v.getNomRegion();
            Region region = mapRegions.get(code);

            if (region == null) {
                 region = new Region(code, nom);
                mapRegions.put(code, region);
            }

            region.ajouterPopulation(v.getPopulation());
        }

        List<Region> regions = new ArrayList<>(mapRegions.values());

        regions.sort((r1, r2) -> r2.getPopulationTotale() - r1.getPopulationTotale());

        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < 10 && i < mapRegions.size(); i++) {
            Region r = mapRegions.get(i);
            System.out.println((i+1) + ". " + r.getClass() + " : " + String.format("%,d", r.getPopulationTotale()).replace(',', ' ') + " habitants");
        }
    }
}
