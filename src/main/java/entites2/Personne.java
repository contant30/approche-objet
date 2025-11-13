package entites2;
import entites.AdressePostale;

public class Personne {

       public String nom;
       public String prenom;
       public AdressePostale adresse;


       // Constructeurs
       public Personne(String nom, String prenom) {
           this.nom = nom;
           this.prenom = prenom;
       }


       // Constructeurs
       public Personne(String nom, String prenom, AdressePostale adresse){
           this.nom = nom;
           this.prenom = prenom;
           this.adresse= adresse ;
       }


       // Methode


        //méthode void qui permet d’afficher (System.out.println) le nom et le prénom avec le nom de famille en majuscules.

       public void afficheNom(){
           System.out.println(prenom+" "+nom.toUpperCase());
       }

       public void changerNom(String nouveauNom){
            this.nom= nouveauNom;
       }

       public void changerPrenom(String nouveauPrenom){
            this.prenom= nouveauPrenom;
       }

       public void changerAdresse(String nouvelleAdresse){
        this.prenom= nouvelleAdresse;
    }

       public String reNom(){
           return this.nom;
       }

        public String rePrenom(String prenom){
            return this.prenom;
        }

        public AdressePostale adresse(String adresse){
            return this.adresse;
         }

    }
