package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args){

        Theatre theatre = new Theatre("Theatre de Montpellier", 250);

        theatre.inscrire(50,200);
        theatre.inscrire(50,200);
        theatre.inscrire(110,200);
        theatre.inscrire(110,200);

        // Affichage du total de clients inscrits
        System.out.println("Total de clients inscrits : " + theatre.getClientInscrits());

        // Affichage de la recette totale
        System.out.println("Recette totale du théatre "+theatre +" "+ theatre.getRecette() + " €");

    }
}
