package fr.diginamic.chaines;

import java.util.Arrays;
import java.util.Locale;

public class ManipulationChaine {
    static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";


        // Création d'un tableau de la variable chaine découper avec split.
        String[]  arrayChaine = chaine.split(";");
        // Affiche les valeurs du tableau
        System.out.println(Arrays.toString(arrayChaine));

        String nom = arrayChaine[0];
        String prenom = arrayChaine[1];
        String salaireStr = arrayChaine[2].replace(" ","");
        Double salaire = Double.parseDouble(salaireStr);

        System.out.println(nom+prenom+salaire);


        // recupère le caractère en position 0 dans la variable chaine avec charAT.
        char premierCaractere = chaine.charAt(0);

        // Récupère le nombre de caractère de la variable chaine.
        int longChaine = chaine.length();

        // Récupère l'index du premiere ; dans la variable chaine.
        int indexChaine = chaine.indexOf(';');

        // Récupère une portion de caractère entre deux index avec substring(int start, int end).
        String portionChaine = chaine.substring(5,15);

        // Récupère le nom de famille avec substring(int start, et avec indexOf)
        String nomChaine = chaine.substring(0, indexChaine);

        // Affiche le nom de famille en majuscule
        String nomMajuscule = chaine.substring(0, indexChaine).toUpperCase(Locale.ROOT);

        // Affiche le nom de famille en minuscule
        String nomMinuscule = chaine.substring(0, indexChaine).toLowerCase(Locale.ROOT);



        System.out.println("Le premier caratere de la variable chaine est "+ premierCaractere);
        System.out.println("La chaine a : "+longChaine+" caractères");
        System.out.println("L'index du premier <;> dans la variable chaine est "+indexChaine);
        System.out.println("Les chaines de caractere entre la portion 5 et 15 sont : "+portionChaine);
        System.out.println("Le nom de famille est " + nomChaine);
        System.out.println("Voici le nom de famille en majuscule : "+ nomMajuscule);
        System.out.println("Voici le nom de famille en majuscule : "+ nomMinuscule);



    }
}
