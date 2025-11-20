package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

    }
}
