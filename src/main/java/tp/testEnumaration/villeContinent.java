package tp.testEnumaration;

import java.util.Objects;

public class villeContinent {

        private String nom;
        private int pop;
        private Continent continent;

        public villeContinent(String nom, int pop, Continent continent) {
            this.nom = nom;
            this.pop = pop;
            this.continent= continent;
        }



        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            tp.listes.Ville ville = (tp.listes.Ville) o;
            return pop == ville.getPop() && Objects.equals(nom, ville.getNom());
        }

        @Override
        public int hashCode() {
            return 0;
        }


    public String getNom() {
            return nom;
        }

        public int getPop() {
            return pop;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

    public void setPop(int pop) {
            this.pop = pop;
        }


    @Override
    public String toString() {
        return "villeContinent{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                ", continent='" + continent + '\'' +
                '}';
    }
}

