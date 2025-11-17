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

    // Getters
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




}
