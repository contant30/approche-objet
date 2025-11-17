package fr.diginamic.salaire;

    // Class file de la class mere Intervenant
public class Salarie extends Intervenant {

    // Attribut
    double salaireMois;

    // Constructeur class mere + Constructeur file
    public Salarie(String nom, String prenom, double salaireMen) {
        super(nom, prenom);
        this.salaireMois = salaireMen;
    }




    // Methode getSalaire vers class mere Intervenant
    @Override
    public Double
    getSalaire() {
        return salaireMois;
    }

    // Methode getStatut vers class mere Intervenant
    @Override
    public String getStatut() {
        return "Salarie";
    }
}
