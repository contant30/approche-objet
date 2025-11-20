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

    // Methode pour lire un fichier CSV
    public static List<Ville> lireVilles(String cheminFichier) {
        // création d'une liste vide
        List<Ville> villes = new ArrayList<>();


        Path inputFile = Paths.get(cheminFichier);

        // permet d'ouvrir le ficher en UTF-8 lgne par ligne
        try (BufferedReader br = Files.newBufferedReader(inputFile, StandardCharsets.UTF_8)) {

            br.readLine(); // Ignorer l'entête

            // on crée une variable ligne
            String ligne;
            //on lit chaque ligne du fichier
            while ((ligne = br.readLine()) != null) {
                //on sépare la ligne a chaque ; que l'on met dans un tableau
                String[] tokens = ligne.split(";");

                // on récupère les infos
                String codeRegion = tokens[0];
                String nomRegion = tokens[1].replace("-"," ");;
                String codeDepartement = tokens[2];
                String codeCommune = tokens[5];
                String nomCommune = tokens[6];
                int population = Integer.parseInt(tokens[9].replace(" ", ""));

                // on crée un objet Ville par ligne lu que l'on ajoute à la liste villes
                villes.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return villes;
    }
}