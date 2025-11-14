package fr.diginamic.Operation;

public class CalculMoyenne {

    //attribut type tableau
    private double[] array;

    // Constructeur pour initialiser le tableau
    public CalculMoyenne() {
        array = new double[0];
    }

    // Méthode pour ajouter un élément
    public void ajout(double nouveau) {

        // Créer un nouveau tableau plus grand
        double[] temp = new double[array.length + 1];

        // Copier les anciennes valeurs
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        // Ajouter le nouvel élément
        temp[array.length] = nouveau;

        // Remplacer l'ancien tableau
        array = temp;
    }


    // Méthode pour calculer la moyenne
    public double calcul() {
        if (array.length == 0) {
            return 0; // éviter division par zéro
        }

        double somme = 0; // on creer une variable
        for (double valeur : array) {
            somme += valeur;
        }

        return somme / array.length;
    }
}