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

        // list du fichier pathFile
        List<String> line = Files.readAllLines(monFichier);

        // création d un nouveau tableau
        List<String> ville= new ArrayList<>();

        // parcour chaque ligne de la liste line
        for (String lines : line){
        String[] tokens = lines.split(";");

        // recherche des variables dans different index
        String nom = tokens[6];
        String departementStr = String.valueOf(tokens[2]);
        String nomRegion = tokens[1];
        String populationStr = String.valueOf(tokens[7]);

        ville.add(nom);

//        System.out.println(nom);
//        System.out.println(nomRegion);
//        System.out.println(populationStr);
//        System.out.println(departementStr);
        }

        System.out.println(ville);
    }
}
