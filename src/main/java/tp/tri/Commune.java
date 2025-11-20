package tp.tri;

import tp.fichier.Ville;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Commune {
    static void main(String[] args) throws IOException {


            // récupère les infos du fichier
            Path monFichier = Paths.get("C:/Users/romai/Downloads/recensement.csv");
            Path outputFile = Paths.get("C:/Users/romai/Downloads/villes_de_plus_de_25k.csv");

            // Création list
            List<String> line = Files.readAllLines(monFichier);

            // création de la liste d'objets Ville
            List<Ville> villes = new ArrayList<>();

            // création de la liste à écrire, avec l entête
            List<String> ville25K = new ArrayList<>();
            ville25K.add("Nom;Code département;Nom region;Population totale");


            // parcours des lignes (ignore l entête avec i=1)
            for (int i = 1; i < line.size(); i++) {
                String[] tokens = line.get(i).split(";");
                String nom = tokens[6];
                String departement = tokens[2];
                String nomRegion = tokens[1];
                int population = Integer.parseInt(tokens[7].replaceAll(" ", ""));

                Ville villeAjout = new Ville(nom, departement, nomRegion, population);
                villes.add(villeAjout);
            }



            // Récupère les villes à plus de 25000
            for (Ville v : villes) {
                if (v.getPopulation() > 25000) {
                    ville25K.add(v.getNom() + ";" + v.getDepartement()+ ";" + v.getNomRegion() + ";" + v.getPopulation());
                    //System.out.println(ville25K);
                }
            }

            // tri par nom de ville

            Collections.sort(villes);
            for (Ville v : villes){
            System.out.println(v);
                }


            // Écriture du fichier
            Files.write(outputFile, ville25K);
            //System.out.println("Fichier créé avec " + (ville25K.size() - 1) + " villes de plus de 25 000 habitants.");


        }
    }

