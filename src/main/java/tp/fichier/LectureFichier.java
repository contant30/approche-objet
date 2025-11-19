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
        Path outputFile = Paths.get("C:/Users/romai/Downloads/nouveauFichierLignes.csv");


        // lecture de toutes les lignes
        List<String> line = Files.readAllLines(monFichier);

        // création de la liste d'objets Ville
        List<Ville> ville = new ArrayList<>();

        // parcours des lignes (ignore l'entête avec i=1)
        for (int i = 1; i < line.size(); i++) {

            String[] tokens = line.get(i).split(";");

            String nom = tokens[6];
            String departement = tokens[2];
            String nomRegion = tokens[1];
            int population = Integer.parseInt(tokens[7].replace(" ", ""));

            Ville villeAjout = new Ville(nom, departement, nomRegion, population);
            ville.add(villeAjout);
        }

        System.out.println(ville);

        // création d'une liste string
        List<String> villeStrings = new ArrayList<>();
        for (Ville v : ville) {
            villeStrings.add(v.toString());
        }

        // Écriture de cette liste dans le fichier de sortie
        Files.write(outputFile, villeStrings);

    }
 }

