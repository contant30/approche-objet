package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Recensement {

    private List<Ville> villes;

    // Constructeur
    public Recensement(List<Ville> villes) {
        this.villes = villes;
    }

    // Getter
    public List<Ville> getVilles() {
        return villes;
    }

    // Lecture du fichier CSV
    public static List<Ville> lireVilles(String cheminFichier) {
        List<Ville> villes = new ArrayList<>();

        Path inputFile = Paths.get(cheminFichier);

        try (BufferedReader br = Files.newBufferedReader(inputFile, StandardCharsets.UTF_8)) {

            br.readLine(); // Ignorer l'entête

            String ligne;
            while ((ligne = br.readLine()) != null) {

                String[] tokens = ligne.split(";");

                String codeRegion = tokens[0];
                String nomRegion = tokens[1];
                String codeDepartement = tokens[2];
                String codeCommune = tokens[5];
                String nomCommune = tokens[6];

                int population = Integer.parseInt(tokens[9].replace(" ", ""));

                villes.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return villes;
    }
}