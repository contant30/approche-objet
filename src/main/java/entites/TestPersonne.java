package entites;
import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){

        Personne prs1 = new Personne("Contant","Romain");
        prs1.adresse= new AdressePostale(3,"chemin du gres",30258,"Montpellier");

        Personne prs2 = new Personne("Contant","David");
        prs2.adresse= new AdressePostale(10,"rue des oiseaux",14569,"Nimes");
    }
}