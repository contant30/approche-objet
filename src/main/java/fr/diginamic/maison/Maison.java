package fr.diginamic.maison;

public class Maison {

    // Attribut tableau de pièces
    Piece[] arrayspiece;

    // Constructeur pour initialiser le tableau vide
    public Maison() {
        arrayspiece = new Piece[0];
    }

    // Methode ajouter une pièce
    public void ajouterPiece(Piece piece) {

        // Vérification que l'utilisateur saisi quelque chose et non valeur vide
        if (piece == null) {
            System.out.println("Veuillez saisir une pièce");
            return;
        }

        // Vérification que l'utilisateur saisi une valeur correcte
        if (piece.getSuperficie() <= 0 || piece.getNumEtage() <= -1) {
            System.out.println("Veuiller rentrer une superficie ou etage valide");
            return;
        }

        // Création d'un nouveau tableau +1
        Piece[] temp = new Piece[arrayspiece.length + 1];

        // Copie de l ancien tableau
        for (int i = 0; i < arrayspiece.length; i++) {
            temp[i] = arrayspiece[i];
        }

        // Ajout d'une nouvelle pièce
        temp[arrayspiece.length] = piece;

        //Remplacer l ancien tableau
        arrayspiece = temp;
        System.out.println("La nouvelle pièce " + piece.getType() + " est ajouté à la maison");
    }

    // Methode qui calcule la superfice totale de la maison
    public double superficieMaison() {
        double total = 0;
        // Parcours de toutes les pièces du tableau
        for (Piece p : arrayspiece) {
            total += p.getSuperficie(); // ajout de la superficie de chaque pièce
        }
        return total;
    }

    public double superficieEtage(int numEtage) {
        double total = 0;

        for (Piece p : arrayspiece) {
            if (p.getNumEtage() == numEtage) {
                total += p.getSuperficie();
            }
        }
        return total;
    }

    // Methode qui retourne la superficie d'un type de pièce
    public double superficiePiece(String pieceRecherche) {
        double total = 0;

        for (Piece p : arrayspiece) {
            if (p.getType() == pieceRecherche) {
                total += p.getSuperficie();
            }
        }
        return total;
    }

    // Methode qui retourne le nombre de type de pièce
    public int nombrePiece(String pieceRecherche) {
        int total = 0;
        //On parcourt le tableau
        for (Piece p : arrayspiece) {
            // Si le type de pièce correspond a pieceRecherche on ajout 1+
            if (p.getType().equalsIgnoreCase(pieceRecherche)) {
                total ++;
            }
        }
        return total;
    }

}
