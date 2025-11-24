package tp.testEnumaration;

public enum Saison {

    PRINTEMPS("printemps",1),
    ETE("ete",2),
    AUTOMNE("automne",3),
    HIVER("hiver",4);

    private String nomSaison;
    private int numero;


    private Saison(String nom, int numero) {
        this.nomSaison=nom;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nomSaison;
    }

    @Override
    public String toString() {
        return "Saison{" +
                "nom='" + nomSaison + '\'' +
                ", numero=" + numero +
                '}';
    }

    public static Saison fromLibelle(String nomSaison) {
        for (Saison s : Saison.values()) { // Parcourt toutes les constantes de l'enum
            if (s.getNom().equalsIgnoreCase(nomSaison)) { // Ignore la casse
                return s; // Retourne la saison correspondante
            }
        }
        return null; // Retourne null si aucune correspondance n'est trouvée
    }


}
