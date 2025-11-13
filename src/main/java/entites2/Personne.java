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

       public void afficheIdentite(){
           System.out.println(prenom+" "+nom.toUpperCase());
       }

       // Méthode pour modifier le Nom
       public void setNom(String nouveauNom){
            this.nom= nouveauNom;
       }

        // Méthode pour modifier le Prénom
       public void setPrenom(String nouveauPrenom){
            this.prenom= nouveauPrenom;
       }

       public void setAdresse(AdressePostale nouvelleAdresse){
            this.adresse= nouvelleAdresse;
        }

       // méthode qui retourne le nom
       public String getNom(){
           return this.nom;
       }

       public String getPrenom(String prenom){
            return this.prenom;
        }

       public AdressePostale getadresse(String adresse){
            return this.adresse;
         }


        @Override
        public String toString() {
            return "Personne{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", adresse=" + adresse +
                    '}';
    }
}
