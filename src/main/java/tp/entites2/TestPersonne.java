package tp.entites2;
import tp.entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args){

        AdressePostale adr1 = new AdressePostale(3,"chemin du gres",30258,"Montpellier");
        AdressePostale adr2 = new AdressePostale(10,"rue des oiseaux",14569,"azerty");

        Personne prs1 = new Personne("Contant","Romain",adr1);
        Personne prs2 = new Personne("Contant","David",adr2);


    prs1.afficheIdentite();

    prs1.setNom("Pierre");
    prs1.afficheIdentite();
    prs1.setAdresse(adr2);

    prs2.afficheIdentite();

    prs1.afficheAdresse();
    System.out.println(prs1.getNom()+" "+prs1.getAdresse());    }
}