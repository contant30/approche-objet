package fr.diginamic.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperations {
    public static void main(String[] args) {


        // Création operation
        Debit op1 = new Debit("01/01/2025", 1452);
        Debit op2 = new Debit("10/05/2024", 145);

        Credit op3 = new Credit("14/05/2024", 100);
        Credit opt4 = new Credit("08/07/2025", 300);

        // Création
        double montantGlo =0 ;


        // Création tableau
        Operation[] tabOperation = {op1, op2, op3, opt4};

        // Affich
        // age chaque ligne du tableau
        for (int i = 0; i < tabOperation.length; i++) {
            System.out.println(tabOperation[i]);
        }


        for (Operation op : tabOperation) {
            if (op.getType().equals("Credit")) {
                montantGlo += op.getMontantOperation();  // ajouter le montant
            } else if (op.getType().equals("Debit")) {
                montantGlo -= op.getMontantOperation();  // soustraire le montant
            }
        }
        System.out.println(montantGlo);
    }
}
