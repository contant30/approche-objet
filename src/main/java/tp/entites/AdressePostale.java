package tp.entites;

public class AdressePostale {

        int numeroRue;
        String libelleRue;
        int codePostal;
        String ville;


        //constructeurs
        public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville){
            this.numeroRue = numeroRue;
            this.libelleRue = libelleRue;
            this.codePostal = codePostal;
            this.ville = ville;
        }

        // pour afficher sur le test
    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
