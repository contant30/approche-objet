package tp.maps.ressources;

public class Employes {

    String nom;
    int salaire;

    public Employes(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
