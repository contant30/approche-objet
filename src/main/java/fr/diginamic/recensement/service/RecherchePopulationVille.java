package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {


    // Methode pour choisir une ville et retourner le nombre de pop
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        // initialisation des variables
        String villeChoisi;
        boolean trouve;

        // do pour exécuter le code au moins une fois
        do {
            // on demande à l'utilisateur d'entrer une ville
            System.out.println("Entrez le nom de la ville :");
            // on stocke sont choix dans nomVille
            villeChoisi = scanner.nextLine();

            // on initialise la variable a false
             trouve = false;

            // Boucle pour parcourir chaque ville de recensement
            for (Ville v : recensement.getVilles()) {
                // on compare NomCommune avec VilleChoisi
                if (v.getNomCommune().equalsIgnoreCase(villeChoisi)) {
                    // Si une comparaison est trouvé, on passe la variable trouve à true
                    trouve = true;
                    // Et on sort de la boucle for
                    break;
                }
                // Si pas de comparaison trouvée.
            }
            if (!trouve) {
                System.out.println("Ville non trouvé");
            }
            // On boucle tant que la variable trouve est false
        }while (!trouve) ;

        int populationVille=0;
        // Si trouve = true
        // On parcourt toutes les villes dans le recensement
        for (Ville v : recensement.getVilles()) {
            populationVille += v.getPopulation();

            // Formatage avec espaces tous les 3 chiffres pour population
            NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
            String populationFormattee = nf.format(populationVille);

            // si le nom de la commune est le même que celui de l'utilisateur
            if (v.getNomCommune().equalsIgnoreCase(villeChoisi)) {
                // on retourne le nombre de populations
                System.out.println("Population de la ville "+villeChoisi +" "+  populationFormattee);
                return;
            }
        }

   }
}
