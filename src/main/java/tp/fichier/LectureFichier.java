package tp.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {
    static void main(String[] args) throws IOException {

        // récupère les infos du fichier
        Path monFichier = Paths.get("C:/Users/romai/Downloads/recensement.csv");
        Path outputFile = Paths.get("C:/Users/romai/Downloads/villes_de_plus_de_25k.csv");

        // lecture de toutes les lignes
        List<String> line = Files.readAllLines(monFichier);

        // création de la liste d'objets Ville
        List<Ville> villes = new ArrayList<>();

        // parcours des lignes (ignore l'entête avec i=1)
        for (int i = 1; i < line.size(); i++) {
            String[] tokens = line.get(i).split(";");

            String nom = tokens[6];
            String departement = tokens[2];
            String nomRegion = tokens[1];
            int population = Integer.parseInt(tokens[7].replace(" ", ""));

            Ville villeAjout = new Ville(nom, departement, nomRegion, population);
            villes.add(villeAjout);
        }

        // création de la liste à écrire, avec l'entête
        List<String> ville25K = new ArrayList<>();
        ville25K.add("Nom;Code departement;Nom region;Population totale");

        for (Ville v : villes) {
            if (v.getPopulation() > 25000) {
                ville25K.add(v.getNom() + ";" + v.getDepartement()
                        + ";" + v.getNomRegion() + ";" + v.getPopulation());
            }
        }
        // Écriture du fichier
        Files.write(outputFile, ville25K);

        System.out.println("Fichier créé avec " + (ville25K.size() - 1) + " villes de plus de 25 000 habitants.");
    }
}