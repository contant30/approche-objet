package entites;
import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){

        Personne prs1 = new Personne();
        prs1.nom= "Contant";
        prs1.prenom= "Romain";
        prs1.adresse= new AdressePostale();
        prs1.adresse.numeroRue = 10;
        prs1.adresse.libelleRue = "adresse";
        prs1.adresse.codePostal = 10256;
        prs1.adresse.ville = "Montpellier";

        Personne prs2 = new Personne();
        prs2.nom= "Pierre";
        prs2.prenom= "Pierre";
        prs2.adresse= new AdressePostale();
        prs2.adresse.numeroRue = 10;
        prs2.adresse.libelleRue = "Les champs";
        prs2.adresse.codePostal = 10256;
        prs2.adresse.ville = "Montpellier";
    }
}