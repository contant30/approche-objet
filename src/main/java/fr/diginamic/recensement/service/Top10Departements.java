package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10Departements extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        // Creation d'une HashMap pour stocker les département
        Map<String, Departement> mapDepartement = new HashMap<>();

        // on parcourt toutes les villes de recensement
        for (Ville v : recensement.getVilles()) {
            // on récupère le code du département
            String code = v.getCodeDepartement();
            // on regarde si le département existe dans la map
            Departement departement = mapDepartement.get(code);

            // Si la map n'as pas le numéro de département
            if (departement == null) {
                // on crée un nouvel objet Département
                departement = new Departement(code);
                // On l'ajoute à la map avec son code
                mapDepartement.put(code, departement);
            }
            // ajout des populations au département
            departement.ajouterPopulation(v.getPopulation());
        }

        // Transforme la Map Departement en List
        List<Departement> departements = new ArrayList<>(mapDepartement.values());
        departements.sort((r1, r2) -> r2.getPopulationTotale() - r1.getPopulationTotale());

        // on affiche les 10 département les plus peuplées
        System.out.println("Les 10 département les plus peuplées :");
        for (int i = 0; i < 10 && i < departements.size(); i++) {
            Departement r = departements.get(i);
            System.out.println((i + 1) + ". " + r.getCodeDepartement() + " : "+ String.format("%,d", r.getPopulationTotale()).replace(',', ' ') + " habitants");
        }

    }
}
