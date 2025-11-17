package fr.diginamic.combat.entites;

public class Personnage {

    // Attributs
    private String nomPerso;
    private int forcePersonnage;
    private int  pointsSantePersonnage;
    private int scorePersonnage;

    // Constructeur
    public Personnage(int forcePersonnage, int pointsSantePersonnage, int scorePersonnage, String nomPerso) {
        this.forcePersonnage = forcePersonnage;
        this.pointsSantePersonnage = pointsSantePersonnage;
        this.nomPerso = nomPerso;
        this.scorePersonnage =0;
    }


    // Methode

    // pour retourner true si point de vie sup a 0 sinon false
    public boolean enVie(){
        return pointsSantePersonnage >0;
    }

    // Methode pour recevoir des dégat
    // Math.max permet de ne pas déscendre en dessous de 0.
    public void recevoirDegats(int degats){
        pointsSantePersonnage= Math.max(0,pointsSantePersonnage-degats);
    }

    // Methode pour attaquer
    public int attaque(Personnage cible){
        int degats = this.forcePersonnage;
        cible.recevoirDegats(degats);
        return degats;
    }








    // Getters pour lire les infos
    public String getNomPerso(){
        return nomPerso;
    }
    public int getForcePersonnage() {
        return forcePersonnage;
    }
    public int getPointsSantePersonnage() {
        return pointsSantePersonnage;
    }
    public int getScorePersonnage() {
        return scorePersonnage;
    }

    // Setters
    // SET modification des points de vie
    public void setPointsSantePersonnage(int sante){
        this.pointsSantePersonnage= sante;
    }

    // SET modification des points
    public void setScorePersonnage(int score){
        this.scorePersonnage= score;
    }


    /*@Override
    public String toString() {
        return String.format("%s [force=%d, pv=%d, score=%d]", nomPerso, force, pointsDeSante, score);
    }*/



}
