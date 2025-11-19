package tp.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    static void main(String[] args) throws IOException {

        Path pathFile = Paths.get("C:/Users/romai/Downloads/recensement.csv");
        Path outputFile = Paths.get("C:/Users/romai/Downloads/nouveauFichierLigne.csv");

        List<String> line = Files.readAllLines(pathFile);

        // Création d'un nouveau tableau avec les 100 première lignes du premier tableau
        List<String> line100 = line.subList(0, 100);

        // Afficher les 100 première lignes
        for (String list : line100) {
            System.out.println(line100);
        }

        // Copie dans un nouveau tableau
        Files.write(outputFile, line100);
    }
}