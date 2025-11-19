package tp.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    static void main(String[] args) throws IOException {

        Path pathFile = Paths.get("C:/Users/romai/Downloads/recensement.csv");

        List<String> line = Files.readAllLines(pathFile);

        // parcourt de chaque ligne du tableau et affiche chaque ligne du tableau
        for (String lines: line){
            System.out.println(lines);
        }
    }
}
