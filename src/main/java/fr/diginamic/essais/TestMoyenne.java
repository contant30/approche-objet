package fr.diginamic.essais;

import fr.diginamic.Operation.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args){


        // Premier test
        CalculMoyenne cm1 = new CalculMoyenne();
        cm1.ajout(165);
        cm1.ajout(28);
        cm1.ajout(78);
        cm1.ajout(45);
        cm1.ajout(54);
        System.out.println("Moyenne du test 1 : " + cm1.calcul());

        // Deuxième test
        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(52);
        cm2.ajout(155);
        cm2.ajout(52);
        cm2.ajout(157);
        cm2.ajout(7);
        cm2.ajout(154);
        System.out.println("Moyenne test 2 : " + cm2.calcul());
    }
}