package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    static void main(String[] args) {

        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(12,1));
        maison.ajouterPiece(new Chambre(10,1));
        maison.ajouterPiece(new Cuisine(15,0));
        maison.ajouterPiece(new Salon(16,0));
        maison.ajouterPiece(new WC(8,0));
        maison.ajouterPiece(new SalleDeBain(12,0));

        System.out.println("La superfice de l etage 1 est de :" +maison.superficieEtage(1)+" m2");
        System.out.println("La superfice de la maison est de  : " + maison.superficieMaison()+" m2" );
        System.out.println("La superfice du rdc est de : "+ maison.superficieEtage(0)+" m2" );
        System.out.println("La superfice total des chmabres est de : "+ maison.superficiePiece("Chambre")+" m2" );
        System.out.println("Le nombre de pièce chambres est de : "+ maison.nombrePiece("Chambre")+" m2" );
    }
}
