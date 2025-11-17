package fr.diginamic.salaire;

    // Class file de la class mere Intervenant
public class Pigiste extends Intervenant{

    // Attribut
    int nbJourTrav;
    double remuJour;

    // Constructeur file + Constructeur de class mere
    public Pigiste(String nom, String prenom,int nbJourTrav, double remuJour) {
        super(nom, prenom);
        this.nbJourTrav= nbJourTrav;
        this.remuJour= remuJour;
    }

    // Methode getSalaire vers class mere Intervenant
    @Override
    public Double getSalaire() {
        return remuJour*nbJourTrav;
    }

    // Methode getStatut vers class mere Intervenant
    @Override
    public String getStatut() {
        return "Pigiste";
    }
}
