package fr.diginamic.recensement.test;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;
import fr.diginamic.recensement.service.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TesteRecherche {
    public static void main(String[] args) throws IOException {

        // récupère les infos du fichier
        List<Ville> villes = Recensement.lireVilles("C:/Users/romai/Downloads/recensement.csv");
        Recensement recensement = new Recensement(villes);


        // Création de l'objet scanner pour lire ce que l'utilisateur tape
        Scanner scanner = new Scanner(System.in);


        // Variable
        int choix;
        MenuService service = null;


        // do pour exécuter le code au moins une fois
        do {

            // Choix de l'utilisteur
            System.out.println("Choisissez une option :");
            System.out.println("1 - Ville");
            System.out.println("2 - département");
            System.out.println("3 - Region");
            System.out.println("4 - Top 10 régions les plus peuplés");
            System.out.println("5 - Top 10 des département les plus peuplés");
            System.out.println("6 - Top 10 des villes les plus peuplé par choix de département");
            System.out.println("7 - Top 10 des villes les plus peuplé par choix de région");
            System.out.println("9 - Sortir");

            // Lecture de ce que tape l'utilisateur et le rentre dans la variable choix
            choix = scanner.nextInt();

            // supprime le saut de ligne
            scanner.nextLine();

            // Recherche population par choix
            // initialisation de la variable service à null
            service = null;

            //
            switch (choix) {
                case 1:
                    service = new RecherchePopulationVille();
                    break;
                case 2:
                    service = new RecherchePopulationDepartement();
                    break;
                case 3:
                    service = new RecherchePopulationRegion();
                    break;
                case 4:
                    Top10Regions top10 = new Top10Regions();
                    top10.traiter(recensement, scanner);
                    break;
                case 5:
                    Top10Departements top10Dep= new Top10Departements();
                    top10Dep.traiter(recensement,scanner);
                case 6:
                    service = new Top10VillesParDepartement();
                    break;
                case 7 :
                    service = new Top10VillesParRegion();
                   break;
                case  9:
                    System.out.println("A la prochaine ");
                    break;

               // si le choix est different de case 1, 2 et 3.
                default: System.out.println("Mauvais choix tapé : ");
                // on modifie la variable service à null
                service = null;
            }
            // Si service est non nul
            if (service != null) {
                //On appel la methode traiter de MenuService
                service.traiter(recensement, scanner);
            }
            // tant que choix n'est pas 9 on boucle
        } while (choix!=9);

    }
}
