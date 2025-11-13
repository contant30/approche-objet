package entites;

public class TestAdressePostale {


        public static void main(String[] args){

            AdressePostale adr1 = new AdressePostale();
            adr1.numeroRue = 10;
            adr1.libelleRue = " des chemin ";
            adr1.codePostal = 20456;
            adr1.ville = "Montpellier";

            AdressePostale adr2 = new AdressePostale();
            adr2.numeroRue = 25;
            adr2.libelleRue = " des limousines ";
            adr2.codePostal = 52693;
            adr2.ville = "Dax";
        }
    }

