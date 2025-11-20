package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        boolean trouve;
        String RegionChoisi;

        // do pour exécuter le code au moins une fois
        do{
            // on demande à l'utilisateur de choisir
             System.out.println("Veuillez choisir un nom de Region :");
            // On stocke sa valeur
            RegionChoisi = scanner.nextLine();

            // initialisation de trouvé à false
            trouve = false;

            //Boucle pour parcourir toutes les villes dans le recensement
        for (Ville v : recensement.getVilles()) {
            // On compare CodeRegion avec RegionChoisi
            if (v.getNomRegion().equals(RegionChoisi)) {
                // on initialise la variable trouve à true quand une comparaison est trouvé
                trouve = true;
                // on sort de la boucle
                break;
            }
        }
        // Si la variable trouve est toujours false à la fin de la boucle
        if (!trouve) {
            System.out.println("Le nom de la region n'existe pas");
        }
        // On boucle tant que la variable trouve est false
        }while (!trouve);


        // Si trouve = true, on passe au code suivant
        // initialise la variable pour additionner les populations
        int popTotale = 0;

        // Boucle for pour parcourir e toutes les villes dans le recensement
        for (Ville v : recensement.getVilles()){

            // Pour chaque boucle, on compare CodeDepartement avec departementChoisi
            if (v.getNomRegion().equals(RegionChoisi)){
                // Si une comparaison est trouvé, on entre sa population dans la variable popTotale
                popTotale += v.getPopulation();
            }
        }

        // Formatage avec espaces tous les 3 chiffres pour popTotale
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        String populationFormattee = nf.format(popTotale);


        // A la fin de la boucle for on affiche la population total.
        System.out.println("Population de la region "+ RegionChoisi+" "+ populationFormattee);

    }
}
