package fr.diginamic.essais;

import fr.diginamic.Operation.Operation;

public class TestOperation {
    public static void main(String[] args){

    double a = 25;
    double b = 45;

        System.out.println("Test addition : " + Operation.calcul(a, b, '+'));
        System.out.println("Test soustraction : " + Operation.calcul(a, b, '-'));
        System.out.println("Test multiplication : " + Operation.calcul(a, b, '*'));
        System.out.println("Test division : " + Operation.calcul(a, b, '/'));
        //System.out.println("Test mauvais opperateur : " + Operation.calcul(a, b, 'h'));

    }
}
