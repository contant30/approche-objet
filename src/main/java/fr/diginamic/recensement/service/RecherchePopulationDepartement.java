package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        // Initialisation variable
        boolean trouve;
        String departementChoisi;

        // on exécute ce qu'il y a dans do avant de faire la boucle
        do {
            // On demande a l'utilisateur de choisir un numéro de département
            System.out.println("Veuillez rentrer un numéro de département");
            // On stocke sa valeur dans la variable departementChoisi
            departementChoisi= scanner.nextLine();

            // on paramètre la variable trouve en false
            trouve = false;

        //Boucle pour parcourir toutes les villes dans le recensement
        for (Ville v : recensement.getVilles()) {
            //On compare le codeDepartement des villes avec le departementChoisi
            if (v.getCodeDepartement().equals(departementChoisi)) {
                //Si une comparaison est bonne on change la variable en true
                trouve = true;
                // on sort de la boucle
                break;
            }
        }   //Si aucune comparaison n'est trouvé
            if(!trouve){
                System.out.println("Département non trouvé");
            }
        // On relance la boucle
        } while (!trouve);

        // On initialise la variable populationDep
        int populationDep=0;

        //Boucle pour parcourir toutes les villes dans le recensement
        for (Ville v : recensement.getVilles()) {
            //On compare le codeDepartement avec le departementChoisi
            if (v.getCodeDepartement().equals(departementChoisi)) {
                // Si la comparaison est bonne ont ajout sa population à la variable populationDep
                populationDep += v.getPopulation();
            }
        }

        // Formatage avec espaces tous les 3 chiffres pour populationDep
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        String populationFormattee = nf.format(populationDep);

        // On affiche la variable populationDep
        System.out.println("Le département "+departementChoisi+ " à "+populationFormattee +" habitants");
    }
}
