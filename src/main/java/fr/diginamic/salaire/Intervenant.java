package fr.diginamic.salaire;

    // Classe mere de Salarie et de Pigiste
public abstract class Intervenant {

    // Attribut
    String nom;
    String prenom;


    // Constructeur
    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Methode abstraite getSalaire vers Salarie et Pigiste
    public abstract Double getSalaire();

    // Methode abstraite pour récupérer le statut de Salarie ou Pigiste
    public abstract String getStatut();

    // Methode pour afficher les donnees des intervenants
    public void afficherDonnes() {
        System.out.println("Nom : "+ nom);
        System.out.println("Prenom : "+ prenom);
        System.out.println("Salaire : "+getSalaire()+" "+'\u20AC');
        System.out.println("Statut : "+getStatut());
        System.out.println("---------------------------");
    }
}
