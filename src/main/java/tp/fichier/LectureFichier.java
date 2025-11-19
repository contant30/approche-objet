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
        Path outputFiless = Paths.get("C:/Users/romai/Downloads/nouveauFichierLigness.csv");


        // list du fichier pathFile
        List<String> line = Files.readAllLines(monFichier);

        // création d un nouveau tableau
        List<Ville> ville= new ArrayList<>();

        // parcour chaque ligne de la liste line
        for (int i = 1 ; i < line.size(); i++){

        String[] tokens = line.get(i).split(";");

        // recherche des variables dans different index
        String nom = tokens[6];
        String departement = String.valueOf(tokens[2]);
        String nomRegion = tokens[1];
        int population = Integer.parseInt(tokens[7].replace(" ", ""));

        // ajout des variables de
        Ville villeAjout = new Ville(nom,departement,nomRegion,population);
        ville.add(villeAjout);
        }

        List<String> villeStrings = new ArrayList<>();
        for (Ville v : ville) {
            villeStrings.add(v.toString());
        }

        Files.write(outputFiless, villeStrings);
        System.out.println(ville);
    }
}
