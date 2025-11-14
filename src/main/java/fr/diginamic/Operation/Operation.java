package fr.diginamic.Operation;

public class Operation {

    private double a;
    private double b;
    private char op;


    //Methode pour calcul
    public static double calcul( double a, double b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        }
        System.out.println("Mauvais opérateur");// si mauvais opérateur rentré
        return 0;
    }



}
